package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        InputMethodManager objManger = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        objManger.hideSoftInputFromWindow(view.getWindowToken(),0);
        editText = findViewById(R.id.edtText);
        Intent intent = new Intent(this,nextPage.class);
        String data = editText.getText().toString();
        intent.putExtra("Data",data);
        startActivity(intent);

    }
}