package com.shahed.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class RootButtonActivity extends AppCompatActivity {

    Button buttonsButton, buttonsSwitch, buttonsImageButton, buttonsCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root_button);

//        initialization
        buttonsButton = findViewById(R.id.buttons_button);
        buttonsImageButton = findViewById(R.id.buttons_image_button);
        buttonsSwitch = findViewById(R.id.buttons_switch);
        buttonsCheckbox = findViewById(R.id.buttons_checkbox);

        buttonsButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, ButtonsButtonActivity.class);
            startActivity(intent);
        });
        buttonsImageButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, ButtonsImageButtonActivity.class);
            startActivity(intent);
        });
        buttonsSwitch.setOnClickListener(view -> {
            Intent intent = new Intent(this, ButtonsSwitchActivity.class);
            startActivity(intent);
        });
        buttonsCheckbox.setOnClickListener(view -> {
            Intent intent = new Intent(this, ButtonsCheckBoxActivity.class);
            startActivity(intent);
        });


    }
}