package com.example.tambaa_kenya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tembe_home extends AppCompatActivity {
TextView textview;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tembe_home);

      button= findViewById(R.id.button_home);
    button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Tembe_home.this,Passenger_login.class);
                startActivity(intent);
            }
        });
    }
}