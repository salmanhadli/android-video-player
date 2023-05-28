package com.example.videoplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView, videoView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
        videoView2 = findViewById(R.id.videoView2);

        // From local storage
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.test1);

        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoView);
        videoView.setMediaController(mc);


        // From internet
        Uri uri = Uri.parse("https://player.vimeo.com/external/460019772.sd.mp4?s=05fd9f7ab7d8802c9c6fabc0a946be723fcd9f40&profile_id=164&oauth2_token_id=57447761");
        videoView2.setVideoURI(uri);

        MediaController mc2 = new MediaController(this);
        mc2.setAnchorView(videoView2);
        videoView2.setMediaController(mc2);
    }
}