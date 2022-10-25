package com.example.tambaa_kenya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Login_choiceActivity extends AppCompatActivity {
    Animation animation;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_choice);
        init();

    }
    private void init(){

        layout=(android.widget.LinearLayout)findViewById(R.id.login_choice);
        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up_animation);
        layout.setAnimation(animation);


    }
}