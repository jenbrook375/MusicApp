package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DrivingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Creates an ArrayList called songInfo that takes input of images and string
        ArrayList<SongInfo> songInfo = new ArrayList<SongInfo>();

        // all images from Unsplash.com unless otherwise noted
        songInfo.add(new SongInfo(R.drawable.trojan,"Trojans", "Atlas Genius"));//Edal Anton Lefterov(WikiCommons)
        songInfo.add(new SongInfo(R.drawable.midnight,"Midnight City", "M83"));//Kyle Martin
        songInfo.add(new SongInfo(R.drawable.fire,"Sex On Fire","Kings of Leon"));//dark rider
        songInfo.add(new SongInfo(R.drawable.safe,"Safe and Sound", "Saint Motel"));//Tim Evans
        songInfo.add(new SongInfo(R.drawable.wish,"Wish I Knew You", "The Revivalists"));//Coley Christine
        songInfo.add(new SongInfo(R.drawable.high,"High", "Sir Sly"));//Gary Rocket
        songInfo.add(new SongInfo(R.drawable.dangerous,"Dangerous","Joywave"));//Adam Birkett
        songInfo.add(new SongInfo(R.drawable.khan,"Genghis Khan", "Mike Snow"));//Sgt.G.S.Thomas(WikiCommons)
        songInfo.add(new SongInfo(R.drawable.wanna,"Do I Wanna Know?", "Artic Monkeys"));//Evan Dennis
        songInfo.add(new SongInfo(R.drawable.talk,"Talk Too Much", "Coin"));//Pavan Trikutam
        songInfo.add(new SongInfo(R.drawable.missio,"KDV","Missio"));//Jennifer Brookshire(self)
        songInfo.add(new SongInfo(R.drawable.type,"My Type","Saint Motel"));//Camille Orgel
        songInfo.add(new SongInfo(R.drawable.take,"Take Me Out","Franz Ferdinand"));//Warren Tobias
        songInfo.add(new SongInfo(R.drawable.know,"Ya Never Know","Terraplane Sun"));//Caitlin Oriel

        /*initializes songInfo array index variable to 0, then sets condition that keeps displaying
                songInfo contents until all songs have been displayed*/
        SongAdapter adapter = new SongAdapter(this, songInfo);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
