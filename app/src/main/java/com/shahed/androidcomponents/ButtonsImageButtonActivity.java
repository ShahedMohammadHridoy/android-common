package com.shahed.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

public class ButtonsImageButtonActivity extends AppCompatActivity {

    ImageButton imgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_image_button);

        imgBtn = findViewById(R.id.img_btn);

        imgBtn.setOnClickListener(view -> {
            Toast.makeText(this, "Image button pressed", Toast.LENGTH_LONG).show();
        });
    }
}