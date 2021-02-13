package com.example.pls;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    ImageButton rosas,morad,cicatrices,safaera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView videoView =(VideoView)findViewById(R.id.videoView);

        final MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        rosas=(ImageButton) findViewById(R.id.rosas);
        morad=(ImageButton) findViewById(R.id.morad);
        cicatrices=(ImageButton) findViewById(R.id.cicatrices);
        safaera=(ImageButton) findViewById(R.id.safaera);

        rosas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/" + R.raw.rosas);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();;
            }
        });

        morad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/" + R.raw.mdlr);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();;
            }
        });

        cicatrices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/" + R.raw.cicatrices);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();;
            }
        });


        safaera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/" + R.raw.safaera);
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();;
            }
        });

    }
}