package com.example.pokem.barrineau_exam3;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MusicActivity extends AppCompatActivity {
    Button btnMusic;
    MediaPlayer mpMusic;
    int playingSong=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        mpMusic = new MediaPlayer();
        mpMusic = MediaPlayer.create(this,R.raw.ukulele);

        btnMusic = (Button)findViewById(R.id.btnPlay);

        btnMusic.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (playingSong){
                    case 0:
                        mpMusic.start();
                        btnMusic.setText("Stop Music");
                        playingSong=1;
                        break;

                    case 1:
                        mpMusic.stop();
                        btnMusic.setText("Play Music");
                        playingSong=0;
                        break;
                }

            }
        });
    }



}
