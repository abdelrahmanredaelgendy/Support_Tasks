package com.example.logintask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class homePage extends AppCompatActivity {
    TextView emailTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        emailTV = findViewById(R.id.emailTV);
        Intent intent = getIntent();
        String name_use = intent.getStringExtra("name_user");
        emailTV.setText("" + name_use);
    }
}