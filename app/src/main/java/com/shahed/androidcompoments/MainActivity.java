package com.shahed.androidcompoments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button textViewButton, buttonButton, imageViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewButton = findViewById(R.id.text_view_button);
        buttonButton = findViewById(R.id.button_button);
        imageViewButton = findViewById(R.id.button_image_view);


        textViewButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
            startActivity(intent);
        });

        buttonButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
            startActivity(intent);
        });

        imageViewButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ImageViewActivity.class);
            startActivity(intent);
        });

    }
}