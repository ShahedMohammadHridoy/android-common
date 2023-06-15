package com.shahed.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class RootCommonActivity extends AppCompatActivity {

    AppCompatButton textViewButton, buttonButton, imageViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root_common);


        textViewButton = findViewById(R.id.text_view_button);
        buttonButton = findViewById(R.id.button_button);
        imageViewButton = findViewById(R.id.button_image_view);


        textViewButton.setOnClickListener(v -> {
            Intent intent = new Intent(RootCommonActivity.this, TextViewActivity.class);
            startActivity(intent);
        });

        buttonButton.setOnClickListener(v -> {
            Intent intent = new Intent(RootCommonActivity.this, ButtonsButtonActivity.class);
            startActivity(intent);
        });

        imageViewButton.setOnClickListener(v -> {
            Intent intent = new Intent(RootCommonActivity.this, ImageViewActivity.class);
            startActivity(intent);
        });
    }
}