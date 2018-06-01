package com.example.android.musicapp;

import android.media.Image;
import android.widget.ImageView;

/*Class SongInfo represents a song in the users library. It contains an image of album art,
  the song title and the artists name*/
public class SongInfo {

    //image representing album art
    private int mAlbumArt;

    //string representing the song title
    private String mSongTitle;

    //string representing the name of the artist
    private String mArtistName;

   /* create a new songInfo object
            @param albumArt is the image
            @param songTitle is the title of the song
            @param artistName is the name of the artist   */

    public SongInfo(int albumArt, String songTitle, String artistName) {
        mAlbumArt = albumArt;
        mSongTitle = songTitle;
        mArtistName = artistName;
    }

    /**
     * Get the name of the song
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get the artist's name
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the album art image resource ID
     */
    public int getAlbumArt() {
        return mAlbumArt;
    }
}
