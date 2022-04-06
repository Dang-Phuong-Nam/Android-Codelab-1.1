package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("My log", "Hello world Debug");
        Log.i("My log", "Hello world Info");
        Log.v("My log", "Verbose message");
        try {
            throw new Exception("Some exception");
        } catch (Exception e) {
            Log.e("My log", e.getMessage());
        }
    }
}