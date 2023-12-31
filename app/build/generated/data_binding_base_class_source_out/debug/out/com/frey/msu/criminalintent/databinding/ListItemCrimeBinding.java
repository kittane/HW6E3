// Generated by view binder compiler. Do not edit!
package com.frey.msu.criminalintent.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.frey.msu.criminalintent.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListItemCrimeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView crimeDate;

  @NonNull
  public final TextView crimeTitle;

  private ListItemCrimeBinding(@NonNull LinearLayout rootView, @NonNull TextView crimeDate,
      @NonNull TextView crimeTitle) {
    this.rootView = rootView;
    this.crimeDate = crimeDate;
    this.crimeTitle = crimeTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemCrimeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemCrimeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item_crime, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemCrimeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.crime_date;
      TextView crimeDate = ViewBindings.findChildViewById(rootView, id);
      if (crimeDate == null) {
        break missingId;
      }

      id = R.id.crime_title;
      TextView crimeTitle = ViewBindings.findChildViewById(rootView, id);
      if (crimeTitle == null) {
        break missingId;
      }

      return new ListItemCrimeBinding((LinearLayout) rootView, crimeDate, crimeTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
