package com.tricktekno.tablayout;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class AndroidTabLayoutActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_tab_layout);

        TabHost tabHost = getTabHost();


        // Tab for Photos
        TabSpec photospec = tabHost.newTabSpec("Android");
        // setting Title and Icon for the Tab
        photospec.setIndicator("Android", getResources().getDrawable(R.drawable.icon_photos_tab));
        Intent photosIntent = new Intent(this, PhotosActivity.class);
        photospec.setContent(photosIntent);

        // Tab for Songs
        TabSpec songspec = tabHost.newTabSpec("Material Design");
        songspec.setIndicator("Material Design", getResources().getDrawable(R.drawable.icon_songs_tab));
        Intent songsIntent = new Intent(this, SongsActivity.class);
        songspec.setContent(songsIntent);

        // Tab for Videos
        TabSpec videospec = tabHost.newTabSpec("Java");
        videospec.setIndicator("Java", getResources().getDrawable(R.drawable.icon_videos_tab));
        Intent videosIntent = new Intent(this, VideosActivity.class);
        videospec.setContent(videosIntent);

        /** Tab for Videos
         TabSpec javaspec = tabHost.newTabSpec("abc");
         videospec.setIndicator("abc", getResources().getDrawable(R.drawable.icon_videos_tab));
         Intent javaIntent = new Intent(this, JavaActivity.class);
         videospec.setContent(javaIntent);**/

        // Adding all TabSpec to TabHost
        tabHost.addTab(photospec); // Adding photos tab
        tabHost.addTab(songspec); // Adding songs tab
        tabHost.addTab(videospec); // Adding videos tab
        //tabHost.addTab(javaspec);
    }



}