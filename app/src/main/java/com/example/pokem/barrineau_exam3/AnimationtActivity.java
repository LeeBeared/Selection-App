package com.example.pokem.barrineau_exam3;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AnimationtActivity extends AppCompatActivity {
    AnimationDrawable appAnimation;
    int playOrNot = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animationt);

        ImageView imgFrame = (ImageView)findViewById(R.id.imgAnimat);
       final Button animateBtn = (Button) findViewById(R.id.btnAnimate);

        imgFrame.setBackgroundResource(R.drawable.animation);
        appAnimation = (AnimationDrawable)imgFrame.getBackground();

       animateBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               switch (playOrNot){
                   case 0:
                       appAnimation.start();
                       animateBtn.setText("Stop Animation");
                       playOrNot=1;
                       break;
                   case 1:
                       appAnimation.stop();
                       animateBtn.setText("Play Animation");
                       playOrNot=0;
                       break;
               }
           }
       });
    }
}
