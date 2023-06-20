package com.shahed.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RootContainersActivity extends AppCompatActivity {

    Button buttonSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root_containers);


//        Initialization
        buttonSpinner = findViewById(R.id.button_spinner);

//        On Click Listener
        buttonSpinner.setOnClickListener(view -> {
            Intent intent = new Intent(this, SpinnerActivity.class);
            startActivity(intent);
        });
    }
}