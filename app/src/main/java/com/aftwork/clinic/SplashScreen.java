package com.aftwork.clinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash_screen );

        //SplashScreen delay 1 detik sebelum menampilkan mainactivity
        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent( SplashScreen.this, MainActivity.class);
                startActivity( intent );
                finish();
            }
        }, 1000 );
    }
}
