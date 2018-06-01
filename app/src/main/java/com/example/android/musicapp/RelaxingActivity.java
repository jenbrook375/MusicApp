package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RelaxingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Creates an ArrayList called songInfo that takes input of images and string
        ArrayList <SongInfo> songInfo = new ArrayList<SongInfo>();

        // All images from Unsplash.com unless otherwise noted
        songInfo.add(new SongInfo(R.drawable.clair,"Clair De Lune", "Claude DeBussy"));//John Silliman
        songInfo.add(new SongInfo(R.drawable.vocalise,"Vocalise", "Sergei Rachmaninoff"));//Radek Grzybowski
        songInfo.add(new SongInfo(R.drawable.romance,"Op.11 Romance for Violin","Antonin Dvorak"));//Roman Kraft
        songInfo.add(new SongInfo(R.drawable.thought,"The Very Thought of You", "Wynton Marsalis"));//Chris Blair
        songInfo.add(new SongInfo(R.drawable.strings,"Adagio for Strings","Samuel Barber"));//Providence Doucet
        songInfo.add(new SongInfo(R.drawable.introit,"Requiem:Introit et Kyrie","Gabriel Faure"));//Jenny Marvin
        songInfo.add(new SongInfo(R.drawable.rhapsody,"Rhapsody in Blue", "George Gershwin"));//Mark Asthoff
        songInfo.add(new SongInfo(R.drawable.gminor,"Adagio in G Minor", "Tomaso Albinoni"));//Manuel Nageli
        songInfo.add(new SongInfo(R.drawable.requiem,"Requiem", "W.A.Mozart"));//Manuel Nageli
        songInfo.add(new SongInfo(R.drawable.concerto,"Op.18 Piano Concerto no.2","Sergei Rachmaninoff"));//Jamille Quiroz

        /*initializes songInfo array index variable to 0, then sets condition that keeps displaying
                songInfo contents until all songs have been displayed*/
        SongAdapter adapter = new SongAdapter(this, songInfo);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        }
    }
