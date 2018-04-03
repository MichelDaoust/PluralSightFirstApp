package com.example;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 12/8/11
 * Time: 4:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class SplitActivity extends Activity implements CourseFragmentCoordinator{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.split_activity);
    }


    @Override
    public void onSelectedCourseChanged(int courseIndex) {
        FragmentManager fragmentManager = getFragmentManager();
        CourseDescriptionFragment descriptionFragment  = (CourseDescriptionFragment) fragmentManager.findFragmentById(R.id.courseDescriptionFragment);
        descriptionFragment.setDisplayedDescription(courseIndex);
    }
}