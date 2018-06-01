package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class StudyingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Creates an ArrayList called songInfo that takes input of images and string
        ArrayList<SongInfo> songInfo = new ArrayList<SongInfo>();

        // All images from Unsplash.com unless otherwise noted
        songInfo.add(new SongInfo(R.drawable.pretty,"PYT", "Michael Jackson"));//Nicole Honeywill
        songInfo.add(new SongInfo(R.drawable.beach,"Good Vibrations", "The Beach Boys"));//Julie Macey
        songInfo.add(new SongInfo(R.drawable.dream,"You Make My Dreams","Hall and Oates"));//Sharon McCutcheon
        songInfo.add(new SongInfo(R.drawable.sugar,"Sugar", "Maroon 5"));//Jasmine Waheed
        songInfo.add(new SongInfo(R.drawable.september,"September", "Earth, Wind & Fire"));//Bridgitte Tohm
        songInfo.add(new SongInfo(R.drawable.road,"Everyday is a Winding Road", "Sheryl Crow"));//Jesse Bowser
        songInfo.add(new SongInfo(R.drawable.lucky,"Get Lucky","Daft Punk"));//Amy Reed
        songInfo.add(new SongInfo(R.drawable.diamonds,"Diamonds", "Rihanna"));//Vincent Solomon
        songInfo.add(new SongInfo(R.drawable.california,"California Gurls", "Katy Perry"));//Ethan Robertson
        songInfo.add(new SongInfo(R.drawable.end,"Till the World Ends", "Britney Spears"));//Al-x

        /*initializes songInfo array index variable to 0, then sets condition that keeps displaying
                songInfo contents until all songs have been displayed*/
        SongAdapter adapter = new SongAdapter(this, songInfo);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
