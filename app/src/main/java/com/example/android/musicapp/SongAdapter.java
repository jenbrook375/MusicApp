package com.example.android.musicapp;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<SongInfo> {

    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songInfo is the list of {@link SongInfo}s to be displayed.
     */
    public SongAdapter(Context context, ArrayList<SongInfo> songInfo) {
        super(context, 0, songInfo);
    }
   @Override
   public View getView(int position, View convertView, ViewGroup parent) {
       // Check if the existing view is being reused, otherwise inflate the view
       View listItemView = convertView;
       if(listItemView == null) {
           listItemView = LayoutInflater.from(getContext()).inflate(
                   R.layout.music_play, parent, false);
       }

       // Get the {@link SongAdapter} object located at this position in the list
       SongInfo currentSong = getItem(position);


       // Find the ImageView in the music_play.xml layout with the ID album_art
       ImageView artView = (ImageView) listItemView.findViewById(R.id.album_art);
       // Get the image resource ID from the current SongInfo object and
       // set the image to the album art ImageView
       artView.setImageResource(currentSong.getAlbumArt());

       // Find the TextView in the music_play.xml layout with the ID song_title
       TextView songTextView = (TextView) listItemView.findViewById(R.id.song_title);
       // Get the song title from the current SongInfo object and
       // set this text on the song title TextView
       songTextView.setText(currentSong.getSongTitle());

       // Find the TextView in the music_play.xml layout with the ID artist_name
       TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_name);
       // Get the artist's name from the current SongInfo object and
       // set this text on the artist name TextView
       artistTextView.setText(currentSong.getArtistName());



       // Return the whole list item layout (containing 2 TextViews and an ImageView)
       // so that it can be shown in the ListView
       return listItemView;
   }
}

