// Generated by view binder compiler. Do not edit!
package com.example.moamoa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.moamoa.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final Button googleLoginBtn;

  @NonNull
  public final EditText idtext;

  @NonNull
  public final Button kakaoLoginBtn;

  @NonNull
  public final ProgressBar loading;

  @NonNull
  public final Button loginbtn;

  @NonNull
  public final Button naverLoginBtn;

  @NonNull
  public final EditText pwtext;

  @NonNull
  public final TextView registerLog;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout container, @NonNull Button googleLoginBtn, @NonNull EditText idtext,
      @NonNull Button kakaoLoginBtn, @NonNull ProgressBar loading, @NonNull Button loginbtn,
      @NonNull Button naverLoginBtn, @NonNull EditText pwtext, @NonNull TextView registerLog) {
    this.rootView = rootView;
    this.container = container;
    this.googleLoginBtn = googleLoginBtn;
    this.idtext = idtext;
    this.kakaoLoginBtn = kakaoLoginBtn;
    this.loading = loading;
    this.loginbtn = loginbtn;
    this.naverLoginBtn = naverLoginBtn;
    this.pwtext = pwtext;
    this.registerLog = registerLog;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout container = (ConstraintLayout) rootView;

      id = R.id.google_login_btn;
      Button googleLoginBtn = ViewBindings.findChildViewById(rootView, id);
      if (googleLoginBtn == null) {
        break missingId;
      }

      id = R.id.idtext;
      EditText idtext = ViewBindings.findChildViewById(rootView, id);
      if (idtext == null) {
        break missingId;
      }

      id = R.id.kakao_login_btn;
      Button kakaoLoginBtn = ViewBindings.findChildViewById(rootView, id);
      if (kakaoLoginBtn == null) {
        break missingId;
      }

      id = R.id.loading;
      ProgressBar loading = ViewBindings.findChildViewById(rootView, id);
      if (loading == null) {
        break missingId;
      }

      id = R.id.loginbtn;
      Button loginbtn = ViewBindings.findChildViewById(rootView, id);
      if (loginbtn == null) {
        break missingId;
      }

      id = R.id.naver_login_btn;
      Button naverLoginBtn = ViewBindings.findChildViewById(rootView, id);
      if (naverLoginBtn == null) {
        break missingId;
      }

      id = R.id.pwtext;
      EditText pwtext = ViewBindings.findChildViewById(rootView, id);
      if (pwtext == null) {
        break missingId;
      }

      id = R.id.register_log;
      TextView registerLog = ViewBindings.findChildViewById(rootView, id);
      if (registerLog == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, container, googleLoginBtn,
          idtext, kakaoLoginBtn, loading, loginbtn, naverLoginBtn, pwtext, registerLog);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
