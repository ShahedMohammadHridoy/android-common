package com.shahed.androidcompoments;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ButtonActivity extends AppCompatActivity {
    Button buttonBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        buttonBtn = findViewById(R.id.button_btn);


        buttonBtn.setOnClickListener(v -> Toast.makeText(ButtonActivity.this, "Button pressed", Toast.LENGTH_SHORT).show());
    }
}