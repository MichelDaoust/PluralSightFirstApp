package com.example;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CourseDescriptionFragment extends Fragment {

    View _fragmentView;

    @Override
    public void onSaveInstanceState(Bundle outState) {
      outState.putInt("courseIndex", _courseIndex);

    }

    String [] _courseDescriptions;
    int _courseIndex;
    TextView _descriptionView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        _fragmentView = inflater.inflate(R.layout.course_description_fragment, container);
        _courseDescriptions = getResources().getStringArray(R.array.courseDescriptions);
        _descriptionView = (TextView) _fragmentView.findViewById(R.id.descriptionTextView);
        int initialIndex = savedInstanceState == null ? 0 : savedInstanceState.getInt("_courseIndex", 0);
        setDisplayedDescription(initialIndex);

        return _fragmentView;
    }

    public void setDisplayedDescription(int courseIndex) {
        _courseIndex = courseIndex;
        _descriptionView.setText(_courseDescriptions[_courseIndex]);
    }
}
