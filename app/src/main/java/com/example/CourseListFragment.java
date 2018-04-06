package com.example;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CourseListFragment extends ListFragment {
    CourseFragmentCoordinator _coordinator;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        _coordinator = (CourseFragmentCoordinator) getActivity();
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        _coordinator.onSelectedCourseChanged(position);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String[] courseTitles = getResources().getStringArray(R.array.courseTitles);
        ArrayAdapter<String> courseTitlesAdapter;
        courseTitlesAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_activated_1,courseTitles);
        setListAdapter(courseTitlesAdapter);
    }
}
