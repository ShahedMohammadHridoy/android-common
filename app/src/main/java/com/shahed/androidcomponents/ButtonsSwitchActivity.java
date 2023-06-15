package com.shahed.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class ButtonsSwitchActivity extends AppCompatActivity {

    SwitchCompat mSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_switch);

        mSwitch = findViewById(R.id.m_switch);


        mSwitch.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Switch On", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Switch Off", Toast.LENGTH_LONG).show();
            }
        });


    }

}
