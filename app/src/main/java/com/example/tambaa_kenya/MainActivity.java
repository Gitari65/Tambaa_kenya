package com.example.tambaa_kenya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Layout;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
Button button;
ImageView animateText,marker;

Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

init();



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,Tembe_home.class);
                startActivity(intent);

            }
        },4000);
    }
    private void init(){

        animateText=(android.widget.ImageView)findViewById(R.id.tk_abbreviation);
        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up_animation);
        animateText.setAnimation(animation);





    }
}