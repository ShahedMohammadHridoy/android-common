package com.shahed.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class ButtonsCheckBoxActivity extends AppCompatActivity {

    CheckBox samsung, nokia, iphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_check_box);

//        Initialization
        samsung = findViewById(R.id.samsung_cb);
        nokia = findViewById(R.id.nokia_cb);
        iphone = findViewById(R.id.iphone_cb);

        samsung.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Samsung is checked", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Samsung is unchecked", Toast.LENGTH_LONG).show();
            }
        });

        nokia.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Nokia is checked", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Nokia is unchecked", Toast.LENGTH_LONG).show();
            }
        });

        iphone.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Iphone is checked", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Iphone is unchecked", Toast.LENGTH_LONG).show();
            }
        });
    }
}