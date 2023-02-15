package com.shahed.androidcompoments;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button common_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        common_button = findViewById(R.id.common_button);
        common_button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CommonActivity.class);
            startActivity(intent);
        });

    }
}