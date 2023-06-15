package com.shahed.androidcompoments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button common_button, button_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_text = (Button) findViewById(R.id.button_text);
        button_text.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TextActivity.class);
            startActivity(intent);
        });

        common_button = findViewById(R.id.common_button);
        common_button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CommonActivity.class);
            startActivity(intent);
        });

    }
}