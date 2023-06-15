package com.shahed.androidcomponents;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ButtonsButtonActivity extends AppCompatActivity {
    Button buttonBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_button);
        buttonBtn = findViewById(R.id.button_btn);


        buttonBtn.setOnClickListener(v -> Toast.makeText(ButtonsButtonActivity.this, "Button pressed", Toast.LENGTH_SHORT).show());
    }
}