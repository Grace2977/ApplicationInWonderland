package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super create
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //this is just toast massage
        Toast.makeText(this, "kim hi!!", Toast.LENGTH_SHORT).show();
    }

    /**
     * asd
     */
}