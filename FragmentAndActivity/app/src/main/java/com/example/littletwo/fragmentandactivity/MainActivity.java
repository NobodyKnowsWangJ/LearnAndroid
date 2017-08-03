package com.example.littletwo.fragmentandactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container,new FirstFragment())
                .addToBackStack(null)
                .commit();
        setContentView(R.layout.activity_main);
    }
}
