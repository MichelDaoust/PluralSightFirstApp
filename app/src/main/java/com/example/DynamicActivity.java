package com.example;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 12/8/11
 * Time: 4:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class DynamicActivity extends Activity implements CourseFragmentCoordinator {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dynamic_activity);

    }

    @Override
    public void onSelectedCourseChanged(int courseIndex) {
        FragmentManager fragmentManager = getFragmentManager();
        CourseDescriptionFragment descriptionFragment =
            (CourseDescriptionFragment) fragmentManager.findFragmentById(R.id.courseDescriptionFragment);
        if (descriptionFragment != null && descriptionFragment.isVisible())
        {
            descriptionFragment.setDisplayedDescription(courseIndex);
        }
        else
        {
            Intent intent = new Intent(this, DynamicDetailsActivity.class);
            intent.putExtra("courseIndex", courseIndex);
            startActivity(intent);
        }


    }
}