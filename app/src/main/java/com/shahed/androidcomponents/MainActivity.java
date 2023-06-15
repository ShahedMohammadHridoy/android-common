package com.shahed.androidcomponents;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button common_button, button_text, button_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Initialization
        common_button = findViewById(R.id.button_common);
        button_text = (Button) findViewById(R.id.button_text);
        button_button = (Button) findViewById(R.id.button_button);


        common_button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RootCommonActivity.class);
            startActivity(intent);
        });
        button_text.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RootTextActivity.class);
            startActivity(intent);
        });
        button_button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RootButtonActivity.class);
            startActivity(intent);
        });

    }
}