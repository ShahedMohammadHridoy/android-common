package com.shahed.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class RootButtonActivity extends AppCompatActivity {

    Button buttonsButton, buttonsSwitch, buttonsImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root_button);

//        initialization
        buttonsButton = findViewById(R.id.buttons_button);
        buttonsImageButton = findViewById(R.id.buttons_image_button);
        buttonsSwitch = findViewById(R.id.buttons_switch);

        buttonsButton.setOnClickListener(view -> {
            Intent intent = new Intent(RootButtonActivity.this, ButtonsButtonActivity.class);
            startActivity(intent);
        });
        buttonsImageButton.setOnClickListener(view -> {
            Intent intent = new Intent(RootButtonActivity.this, ButtonsImageButtonActivity.class);
            startActivity(intent);
        });
        buttonsSwitch.setOnClickListener(view -> {
            Intent intent = new Intent(RootButtonActivity.this, ButtonsSwitchActivity.class);
            startActivity(intent);
        });


    }
}