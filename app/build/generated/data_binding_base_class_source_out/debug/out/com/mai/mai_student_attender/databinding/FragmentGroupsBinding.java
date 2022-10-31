// Generated by view binder compiler. Do not edit!
package com.mai.mai_student_attender.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.mai.mai_student_attender.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentGroupsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout GroupNav;

  @NonNull
  public final Button buttonAddGroups;

  @NonNull
  public final Button buttonGroup1;

  @NonNull
  public final Button buttonGroup2;

  @NonNull
  public final Button buttonGroup3;

  @NonNull
  public final Button buttonGroup4;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ConstraintLayout constraintLayout2;

  @NonNull
  public final ConstraintLayout constraintLayout3;

  @NonNull
  public final TextView nameGroup1;

  @NonNull
  public final TextView nameGroup2;

  @NonNull
  public final TextView nameGroup3;

  @NonNull
  public final TextView nameGroup4;

  @NonNull
  public final TextView yourGpours;

  private FragmentGroupsBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout GroupNav, @NonNull Button buttonAddGroups,
      @NonNull Button buttonGroup1, @NonNull Button buttonGroup2, @NonNull Button buttonGroup3,
      @NonNull Button buttonGroup4, @NonNull ConstraintLayout constraintLayout,
      @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3,
      @NonNull TextView nameGroup1, @NonNull TextView nameGroup2, @NonNull TextView nameGroup3,
      @NonNull TextView nameGroup4, @NonNull TextView yourGpours) {
    this.rootView = rootView;
    this.GroupNav = GroupNav;
    this.buttonAddGroups = buttonAddGroups;
    this.buttonGroup1 = buttonGroup1;
    this.buttonGroup2 = buttonGroup2;
    this.buttonGroup3 = buttonGroup3;
    this.buttonGroup4 = buttonGroup4;
    this.constraintLayout = constraintLayout;
    this.constraintLayout2 = constraintLayout2;
    this.constraintLayout3 = constraintLayout3;
    this.nameGroup1 = nameGroup1;
    this.nameGroup2 = nameGroup2;
    this.nameGroup3 = nameGroup3;
    this.nameGroup4 = nameGroup4;
    this.yourGpours = yourGpours;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentGroupsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentGroupsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_groups, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentGroupsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout GroupNav = (ConstraintLayout) rootView;

      id = R.id.button_add_Groups;
      Button buttonAddGroups = ViewBindings.findChildViewById(rootView, id);
      if (buttonAddGroups == null) {
        break missingId;
      }

      id = R.id.button_Group1;
      Button buttonGroup1 = ViewBindings.findChildViewById(rootView, id);
      if (buttonGroup1 == null) {
        break missingId;
      }

      id = R.id.button_Group2;
      Button buttonGroup2 = ViewBindings.findChildViewById(rootView, id);
      if (buttonGroup2 == null) {
        break missingId;
      }

      id = R.id.button_Group3;
      Button buttonGroup3 = ViewBindings.findChildViewById(rootView, id);
      if (buttonGroup3 == null) {
        break missingId;
      }

      id = R.id.button_Group4;
      Button buttonGroup4 = ViewBindings.findChildViewById(rootView, id);
      if (buttonGroup4 == null) {
        break missingId;
      }

      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.constraintLayout2;
      ConstraintLayout constraintLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout2 == null) {
        break missingId;
      }

      id = R.id.constraintLayout3;
      ConstraintLayout constraintLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout3 == null) {
        break missingId;
      }

      id = R.id.name_Group1;
      TextView nameGroup1 = ViewBindings.findChildViewById(rootView, id);
      if (nameGroup1 == null) {
        break missingId;
      }

      id = R.id.name_Group2;
      TextView nameGroup2 = ViewBindings.findChildViewById(rootView, id);
      if (nameGroup2 == null) {
        break missingId;
      }

      id = R.id.name_Group3;
      TextView nameGroup3 = ViewBindings.findChildViewById(rootView, id);
      if (nameGroup3 == null) {
        break missingId;
      }

      id = R.id.name_Group4;
      TextView nameGroup4 = ViewBindings.findChildViewById(rootView, id);
      if (nameGroup4 == null) {
        break missingId;
      }

      id = R.id.your_gpours;
      TextView yourGpours = ViewBindings.findChildViewById(rootView, id);
      if (yourGpours == null) {
        break missingId;
      }

      return new FragmentGroupsBinding((ConstraintLayout) rootView, GroupNav, buttonAddGroups,
          buttonGroup1, buttonGroup2, buttonGroup3, buttonGroup4, constraintLayout,
          constraintLayout2, constraintLayout3, nameGroup1, nameGroup2, nameGroup3, nameGroup4,
          yourGpours);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
