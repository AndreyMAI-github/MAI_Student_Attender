// Generated by view binder compiler. Do not edit!
package com.mai.mai_student_attender.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.mai.mai_student_attender.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPanelBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomNavigationView navView;

  @NonNull
  public final ConstraintLayout panelNav;

  @NonNull
  public final FrameLayout panelOut;

  private ActivityPanelBinding(@NonNull ConstraintLayout rootView,
      @NonNull BottomNavigationView navView, @NonNull ConstraintLayout panelNav,
      @NonNull FrameLayout panelOut) {
    this.rootView = rootView;
    this.navView = navView;
    this.panelNav = panelNav;
    this.panelOut = panelOut;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPanelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPanelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_panel, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPanelBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.nav_view;
      BottomNavigationView navView = ViewBindings.findChildViewById(rootView, id);
      if (navView == null) {
        break missingId;
      }

      ConstraintLayout panelNav = (ConstraintLayout) rootView;

      id = R.id.panel_out;
      FrameLayout panelOut = ViewBindings.findChildViewById(rootView, id);
      if (panelOut == null) {
        break missingId;
      }

      return new ActivityPanelBinding((ConstraintLayout) rootView, navView, panelNav, panelOut);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
