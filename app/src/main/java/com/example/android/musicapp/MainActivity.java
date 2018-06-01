package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         // This finds the relaxing_music TextView
        TextView relax = (TextView)findViewById(R.id.relaxing_music);

       /* This creates the onClickListener that sends the user to the RelaxingActivity
           when Music for Relaxing is clicked*/
        relax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // This creates the intent to the RelaxingActivity
                final Intent relaxingIntent = new Intent(MainActivity.this, RelaxingActivity.class );
                startActivity(relaxingIntent);
            }
        });

        // This finds the driving_music TextView
        TextView drive = (TextView)findViewById(R.id.driving_music);

       /* This creates the onClickListener that sends the user to the DrivingActivity
           when Music for Driving is clicked*/
        drive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // This creates the intent to the RelaxingActivity
                final Intent drivingIntent = new Intent(MainActivity.this, DrivingActivity.class );
                startActivity(drivingIntent);
            }
        });

        // This finds the studying_music TextView
        TextView study = (TextView)findViewById(R.id.studying_music);

       /* This creates the onClickListener that sends the user to the StudyingActivity
           when Music for Studying is clicked*/
        study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // This creates the intent to the StudyingActivity
                final Intent studyingIntent = new Intent(MainActivity.this, StudyingActivity.class );
                startActivity(studyingIntent);
            }
        });




    }

}

