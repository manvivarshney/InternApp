package com.domain.internapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SplashScreenActivity extends AppCompatActivity {

//import com.example.delllatitude.appolog.PrefManager;
//import com.example.delllatitude.appolog.R;

        private FirebaseAuth firebaseAuth;

        private static int SPLASH_TIME_OUT = 2000;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_screen);


            firebaseAuth = FirebaseAuth.getInstance();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i;

                        i = new Intent(SplashScreenActivity.this, LoginActivity.class);

                    startActivity(i);

                    // close this activity
                    finish();
                }
            }, SPLASH_TIME_OUT);
        }
    }