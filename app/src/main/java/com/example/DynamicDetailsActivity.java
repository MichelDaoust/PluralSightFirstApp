package com.example;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DynamicDetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dynamic_details_activity);
        Intent startupIntent = getIntent();
        int courseIndex = startupIntent.getIntExtra("courseIndex", 0);

        FragmentManager fragmentManager = getFragmentManager();
        CourseDescriptionFragment descriptionFragment =
            (CourseDescriptionFragment) fragmentManager.findFragmentById(R.id.courseDescriptionFragment);
        descriptionFragment.setDisplayedDescription(courseIndex);
    }
}
