// Generated by view binder compiler. Do not edit!
package com.example.moamoa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.moamoa.R;
import com.google.android.material.appbar.AppBarLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChatsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RelativeLayout RLBottommenu;

  @NonNull
  public final RelativeLayout RLMyaccountProfile;

  @NonNull
  public final RelativeLayout RLTheiraccountProfile;

  @NonNull
  public final TextView TextViewMyaccount;

  @NonNull
  public final TextView TextViewTheiraccount;

  @NonNull
  public final TextView chatbarname;

  @NonNull
  public final FrameLayout chatsBtnGetoutofroom;

  @NonNull
  public final Button chatsBtnSelectlanguage;

  @NonNull
  public final RecyclerView chatsFormlist;

  @NonNull
  public final TextView chatsMynationality;

  @NonNull
  public final CircleImageView chatsMyprofileImage;

  @NonNull
  public final RelativeLayout chatsRLSelectlanguage;

  @NonNull
  public final TextView chatsRecyclerviewUserinfoDestinationUID;

  @NonNull
  public final TextView chatsRecyclerviewUserinfoUID;

  @NonNull
  public final TextView chatsTextViewCurrentlang;

  @NonNull
  public final TextView chatsTextViewFormlist;

  @NonNull
  public final TextView chatsTextViewLanginfo;

  @NonNull
  public final TextView chatsTextViewMynickname;

  @NonNull
  public final TextView chatsTextViewSelectlanguage;

  @NonNull
  public final TextView chatsTextViewTheirnickname;

  @NonNull
  public final TextView chatsTheirnationality;

  @NonNull
  public final CircleImageView chatsTheirprofileImage;

  @NonNull
  public final FrameLayout chatscontainer;

  @NonNull
  public final AppBarLayout chatstoolbar;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final FrameLayout drawerButton;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final RelativeLayout layoutChatUserinfo;

  @NonNull
  public final Toolbar toolbar;

  private ActivityChatsBinding(@NonNull ConstraintLayout rootView,
      @NonNull RelativeLayout RLBottommenu, @NonNull RelativeLayout RLMyaccountProfile,
      @NonNull RelativeLayout RLTheiraccountProfile, @NonNull TextView TextViewMyaccount,
      @NonNull TextView TextViewTheiraccount, @NonNull TextView chatbarname,
      @NonNull FrameLayout chatsBtnGetoutofroom, @NonNull Button chatsBtnSelectlanguage,
      @NonNull RecyclerView chatsFormlist, @NonNull TextView chatsMynationality,
      @NonNull CircleImageView chatsMyprofileImage, @NonNull RelativeLayout chatsRLSelectlanguage,
      @NonNull TextView chatsRecyclerviewUserinfoDestinationUID,
      @NonNull TextView chatsRecyclerviewUserinfoUID, @NonNull TextView chatsTextViewCurrentlang,
      @NonNull TextView chatsTextViewFormlist, @NonNull TextView chatsTextViewLanginfo,
      @NonNull TextView chatsTextViewMynickname, @NonNull TextView chatsTextViewSelectlanguage,
      @NonNull TextView chatsTextViewTheirnickname, @NonNull TextView chatsTheirnationality,
      @NonNull CircleImageView chatsTheirprofileImage, @NonNull FrameLayout chatscontainer,
      @NonNull AppBarLayout chatstoolbar, @NonNull ConstraintLayout container,
      @NonNull FrameLayout drawerButton, @NonNull DrawerLayout drawerLayout,
      @NonNull RelativeLayout layoutChatUserinfo, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.RLBottommenu = RLBottommenu;
    this.RLMyaccountProfile = RLMyaccountProfile;
    this.RLTheiraccountProfile = RLTheiraccountProfile;
    this.TextViewMyaccount = TextViewMyaccount;
    this.TextViewTheiraccount = TextViewTheiraccount;
    this.chatbarname = chatbarname;
    this.chatsBtnGetoutofroom = chatsBtnGetoutofroom;
    this.chatsBtnSelectlanguage = chatsBtnSelectlanguage;
    this.chatsFormlist = chatsFormlist;
    this.chatsMynationality = chatsMynationality;
    this.chatsMyprofileImage = chatsMyprofileImage;
    this.chatsRLSelectlanguage = chatsRLSelectlanguage;
    this.chatsRecyclerviewUserinfoDestinationUID = chatsRecyclerviewUserinfoDestinationUID;
    this.chatsRecyclerviewUserinfoUID = chatsRecyclerviewUserinfoUID;
    this.chatsTextViewCurrentlang = chatsTextViewCurrentlang;
    this.chatsTextViewFormlist = chatsTextViewFormlist;
    this.chatsTextViewLanginfo = chatsTextViewLanginfo;
    this.chatsTextViewMynickname = chatsTextViewMynickname;
    this.chatsTextViewSelectlanguage = chatsTextViewSelectlanguage;
    this.chatsTextViewTheirnickname = chatsTextViewTheirnickname;
    this.chatsTheirnationality = chatsTheirnationality;
    this.chatsTheirprofileImage = chatsTheirprofileImage;
    this.chatscontainer = chatscontainer;
    this.chatstoolbar = chatstoolbar;
    this.container = container;
    this.drawerButton = drawerButton;
    this.drawerLayout = drawerLayout;
    this.layoutChatUserinfo = layoutChatUserinfo;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChatsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChatsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_chats, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChatsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.RL_bottommenu;
      RelativeLayout RLBottommenu = ViewBindings.findChildViewById(rootView, id);
      if (RLBottommenu == null) {
        break missingId;
      }

      id = R.id.RL_myaccount_profile;
      RelativeLayout RLMyaccountProfile = ViewBindings.findChildViewById(rootView, id);
      if (RLMyaccountProfile == null) {
        break missingId;
      }

      id = R.id.RL_theiraccount_profile;
      RelativeLayout RLTheiraccountProfile = ViewBindings.findChildViewById(rootView, id);
      if (RLTheiraccountProfile == null) {
        break missingId;
      }

      id = R.id.TextView_myaccount;
      TextView TextViewMyaccount = ViewBindings.findChildViewById(rootView, id);
      if (TextViewMyaccount == null) {
        break missingId;
      }

      id = R.id.TextView_theiraccount;
      TextView TextViewTheiraccount = ViewBindings.findChildViewById(rootView, id);
      if (TextViewTheiraccount == null) {
        break missingId;
      }

      id = R.id.chatbarname;
      TextView chatbarname = ViewBindings.findChildViewById(rootView, id);
      if (chatbarname == null) {
        break missingId;
      }

      id = R.id.chats_btn_getoutofroom;
      FrameLayout chatsBtnGetoutofroom = ViewBindings.findChildViewById(rootView, id);
      if (chatsBtnGetoutofroom == null) {
        break missingId;
      }

      id = R.id.chats_btn_selectlanguage;
      Button chatsBtnSelectlanguage = ViewBindings.findChildViewById(rootView, id);
      if (chatsBtnSelectlanguage == null) {
        break missingId;
      }

      id = R.id.chats_formlist;
      RecyclerView chatsFormlist = ViewBindings.findChildViewById(rootView, id);
      if (chatsFormlist == null) {
        break missingId;
      }

      id = R.id.chats_mynationality;
      TextView chatsMynationality = ViewBindings.findChildViewById(rootView, id);
      if (chatsMynationality == null) {
        break missingId;
      }

      id = R.id.chats_myprofile_image;
      CircleImageView chatsMyprofileImage = ViewBindings.findChildViewById(rootView, id);
      if (chatsMyprofileImage == null) {
        break missingId;
      }

      id = R.id.chats_RL_selectlanguage;
      RelativeLayout chatsRLSelectlanguage = ViewBindings.findChildViewById(rootView, id);
      if (chatsRLSelectlanguage == null) {
        break missingId;
      }

      id = R.id.chats_recyclerview_userinfo_destinationUID;
      TextView chatsRecyclerviewUserinfoDestinationUID = ViewBindings.findChildViewById(rootView, id);
      if (chatsRecyclerviewUserinfoDestinationUID == null) {
        break missingId;
      }

      id = R.id.chats_recyclerview_userinfo_UID;
      TextView chatsRecyclerviewUserinfoUID = ViewBindings.findChildViewById(rootView, id);
      if (chatsRecyclerviewUserinfoUID == null) {
        break missingId;
      }

      id = R.id.chats_TextView_currentlang;
      TextView chatsTextViewCurrentlang = ViewBindings.findChildViewById(rootView, id);
      if (chatsTextViewCurrentlang == null) {
        break missingId;
      }

      id = R.id.chats_TextView_formlist;
      TextView chatsTextViewFormlist = ViewBindings.findChildViewById(rootView, id);
      if (chatsTextViewFormlist == null) {
        break missingId;
      }

      id = R.id.chats_TextView_langinfo;
      TextView chatsTextViewLanginfo = ViewBindings.findChildViewById(rootView, id);
      if (chatsTextViewLanginfo == null) {
        break missingId;
      }

      id = R.id.chats_TextView_mynickname;
      TextView chatsTextViewMynickname = ViewBindings.findChildViewById(rootView, id);
      if (chatsTextViewMynickname == null) {
        break missingId;
      }

      id = R.id.chats_TextView_selectlanguage;
      TextView chatsTextViewSelectlanguage = ViewBindings.findChildViewById(rootView, id);
      if (chatsTextViewSelectlanguage == null) {
        break missingId;
      }

      id = R.id.chats_TextView_theirnickname;
      TextView chatsTextViewTheirnickname = ViewBindings.findChildViewById(rootView, id);
      if (chatsTextViewTheirnickname == null) {
        break missingId;
      }

      id = R.id.chats_theirnationality;
      TextView chatsTheirnationality = ViewBindings.findChildViewById(rootView, id);
      if (chatsTheirnationality == null) {
        break missingId;
      }

      id = R.id.chats_theirprofile_image;
      CircleImageView chatsTheirprofileImage = ViewBindings.findChildViewById(rootView, id);
      if (chatsTheirprofileImage == null) {
        break missingId;
      }

      id = R.id.chatscontainer;
      FrameLayout chatscontainer = ViewBindings.findChildViewById(rootView, id);
      if (chatscontainer == null) {
        break missingId;
      }

      id = R.id.chatstoolbar;
      AppBarLayout chatstoolbar = ViewBindings.findChildViewById(rootView, id);
      if (chatstoolbar == null) {
        break missingId;
      }

      ConstraintLayout container = (ConstraintLayout) rootView;

      id = R.id.drawer_button;
      FrameLayout drawerButton = ViewBindings.findChildViewById(rootView, id);
      if (drawerButton == null) {
        break missingId;
      }

      id = R.id.drawer_layout;
      DrawerLayout drawerLayout = ViewBindings.findChildViewById(rootView, id);
      if (drawerLayout == null) {
        break missingId;
      }

      id = R.id.layout_chat_userinfo;
      RelativeLayout layoutChatUserinfo = ViewBindings.findChildViewById(rootView, id);
      if (layoutChatUserinfo == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityChatsBinding((ConstraintLayout) rootView, RLBottommenu, RLMyaccountProfile,
          RLTheiraccountProfile, TextViewMyaccount, TextViewTheiraccount, chatbarname,
          chatsBtnGetoutofroom, chatsBtnSelectlanguage, chatsFormlist, chatsMynationality,
          chatsMyprofileImage, chatsRLSelectlanguage, chatsRecyclerviewUserinfoDestinationUID,
          chatsRecyclerviewUserinfoUID, chatsTextViewCurrentlang, chatsTextViewFormlist,
          chatsTextViewLanginfo, chatsTextViewMynickname, chatsTextViewSelectlanguage,
          chatsTextViewTheirnickname, chatsTheirnationality, chatsTheirprofileImage, chatscontainer,
          chatstoolbar, container, drawerButton, drawerLayout, layoutChatUserinfo, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
