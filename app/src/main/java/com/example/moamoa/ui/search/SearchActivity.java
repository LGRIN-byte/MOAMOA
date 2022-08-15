package com.example.moamoa.ui.search;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.moamoa.Form;
import com.example.moamoa.R;
import com.example.moamoa.databinding.ActivityChatsBinding;
import com.example.moamoa.databinding.ActivitySearchBinding;
import com.example.moamoa.databinding.EmptyFormsBinding;
import com.example.moamoa.ui.account.User;
import com.example.moamoa.ui.category.CustomListView;
import com.example.moamoa.ui.category.PlaceholderFragment;
import com.example.moamoa.ui.formdetail.FormdetailActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    private ActivitySearchBinding binding;

    private ArrayList<Form> arrayList;  // 리스트 안에 담을 데이터들을 저장
    private CustomListView customListView;  // 리스트뷰 어댑터

    private EditText EditText_search;
    private String search_std, search_input;
    private Button search_btn;

    public static SearchActivity newInstance(int index){
        SearchActivity searchActivity = new SearchActivity();
        return searchActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        binding = ActivitySearchBinding.inflate(getLayoutInflater());
        View root = binding.getRoot();

        // 리스트뷰 정의
        ListView listView = findViewById(R.id.search_listview);

        // 리스트 모두 가져오기
        arrayList = new ArrayList<>();
        FirebaseDatabase.getInstance().getReference("form").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                arrayList.clear();
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    Form form = dataSnapshot.getValue(Form.class);
                    arrayList.add(form);
                    Log.e("TEST", "form: "+form);
                }
                customListView = new CustomListView(arrayList); // 어댑터 지정 (각 리스트들의 정보들 관리)
                listView.setAdapter(customListView);            // 리스트뷰의 어댑터 지정
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(SearchActivity.this, "error: "+error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // 검색 기준 설정 (제목/사용자닉네임)
        Spinner spinner = findViewById(R.id.searchspinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                search_std = adapterView.getItemAtPosition(position).toString();
                Log.e("TEST", "search_std: "+search_std);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // 검색 버튼을 누르면 해당되는 게시물 불러옴
        EditText_search = findViewById(R.id.searchWord);
        search_btn = findViewById(R.id.searchBtn);
        search_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 검색할 텍스트 search_input에 저장
                search_input = EditText_search.getText().toString();
                Log.e("TEST", "search_input: "+search_input);   // 삭제예정코드(확인용)

                // 각각 제목/작성자이름 기준으로 검색
                // search_input 포함하는 게시글 찾아 목록에 추가

                // 제목 기준 게시물 검색
                if (search_std.equals("제목")){
                    Toast.makeText(getApplicationContext(), "제목 기준", Toast.LENGTH_SHORT).show();
                    Log.e("TEST", "search_input: "+search_input);

                    arrayList = new ArrayList<>();
                    FirebaseDatabase.getInstance().getReference().child("form").addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            arrayList.clear();
                            // for문 돌려서 해당 키워드가 제목에 있는지 검색
                            for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                                Form form = dataSnapshot.getValue(Form.class);
                                // 키워드가 제목에 있으면 add
                                if (form.subject.contains(search_input)){
                                    arrayList.add(form);
                                    Log.e("TEST", "form: "+form);
                                }
                            }
                            customListView = new CustomListView(arrayList); // 어댑터 지정 (각 리스트들의 정보들 관리)
                            listView.setAdapter(customListView);            // 리스트뷰의 어댑터 지정
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            Toast.makeText(SearchActivity.this, "error: "+error.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            String FID = arrayList.get(position).FID;
                            String title = arrayList.get(position).subject;

                            // 액티비티 이동 + 값 전달
                            Intent intent = new Intent(getApplicationContext(), FormdetailActivity.class);
                            intent.putExtra("FID", FID);    //input값 intent로 전달
                            startActivity(intent);
                        }
                    });
                }

                // 작성자 이름 기준 게시물 검색
                else if (search_std.equals("이름")){
                    Toast.makeText(getApplicationContext(), "작성자 이름 기준", Toast.LENGTH_SHORT).show();
                    Log.e("TEST", "search_input: "+search_input);

                    // 이거어떡해야되냐면... 일단 폼을 불러와 불러오는데 이제 거기 UID를 가지고 유저 검색을 해서 이게 이 닉네임이
                    // 엥 아니지? 그냥 UID가 맞는지 찾아보면 되는거잖아
                    // 그니까 작성자를 찾아봐 아 습 아닌가... 일단 닉네임으로 검색을 하는거잖아 그럼
                    // 어니다 그냥 아이디랑 닉네임 일일이 대조하는게 나을듯...
                    // 일단 for문을 돌린 뒤에 그 안에서 검색하면 되나

                    FirebaseDatabase.getInstance().getReference().child("form").addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            arrayList.clear();
                            // for문 돌려서 해당 키워드와 작성자 이름이 맞는 게시물이 있는지 검색
                            for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                                Form form = dataSnapshot.getValue(Form.class);

                                // UID_dash로 닉네임 검색 위해 users 불러옴
                                FirebaseDatabase.getInstance().getReference().child("users").child(form.UID_dash)
                                        .addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        User user = snapshot.getValue(User.class);

                                        // 닉네임 불러옴
                                        String usernick = snapshot.child("nick").getValue().toString();

                                        // 닉네임이 맞을 시 add
                                        if (usernick.equals(search_input)){
                                            arrayList.add(form);
                                            Log.e("TEST", "form: "+form);
                                        }
                                    }

                                    @Override
                                    public void onCancelled(@NonNull DatabaseError error) {

                                    }
                                });
                            }
                            customListView = new CustomListView(arrayList); // 어댑터 지정 (각 리스트들의 정보들 관리)
                            listView.setAdapter(customListView);            // 리스트뷰의 어댑터 지정
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            Toast.makeText(SearchActivity.this, "error: "+error.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            String FID = arrayList.get(position).FID;
                            String title = arrayList.get(position).subject;

                            // 액티비티 이동 + 값 전달
                            Intent intent = new Intent(getApplicationContext(), FormdetailActivity.class);
                            intent.putExtra("FID", FID);    //input값 intent로 전달
                            startActivity(intent);
                        }
                    });
                }
            }
        });


    }
}