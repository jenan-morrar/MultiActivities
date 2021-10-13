package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class nextPage extends AppCompatActivity {

    private TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        Intent intent = getIntent();
        String data = intent.getStringExtra("Data");
        txtView = findViewById(R.id.txtView);
        txtView.setText(data);
    }
}