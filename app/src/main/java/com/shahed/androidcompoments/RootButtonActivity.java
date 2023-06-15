package com.shahed.androidcompoments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class RootButtonActivity extends AppCompatActivity {

    Button buttonsButton, buttonsSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root_button);

//        initialization
        buttonsButton = (Button) findViewById(R.id.buttons_button);
        buttonsSwitch = (Button) findViewById(R.id.buttons_switch);

        buttonsSwitch.setOnClickListener(view -> {
            Intent intent = new Intent(RootButtonActivity.this, ButtonsSwitchActivity.class);
            startActivity(intent);
        });


    }
}