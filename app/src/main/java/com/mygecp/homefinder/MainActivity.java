package com.mygecp.homefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent iHome = new Intent(MainActivity.this,After_Login.class);
        MaterialButton mt= findViewById(R.id.login);
        mt.setOnClickListener(e->{

             startActivity(iHome);
             finish();
        });
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//                startActivity(iHome);
//                finish();
//            }
//        },5000);
    }
}