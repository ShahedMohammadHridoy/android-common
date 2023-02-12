package com.shahed.androidcompoments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button textViewButton, buttonButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewButton = findViewById(R.id.text_view_button);
        buttonButton = findViewById(R.id.button_button);


        textViewButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
            startActivity(intent);
        });

        buttonButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
            startActivity(intent);
        });

    }
}