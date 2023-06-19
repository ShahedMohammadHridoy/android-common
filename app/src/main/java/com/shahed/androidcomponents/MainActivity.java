package com.shahed.androidcomponents;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
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

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.warning);
        builder.setMessage(R.string.warning_message);
        builder.setIcon(R.drawable.warning);
        builder.setCancelable(false);
        builder.setPositiveButton(R.string.exit, (dialogInterface, i) -> finish());
        builder.setNegativeButton(R.string.cancel, (dialogInterface, i) -> dialogInterface.dismiss());
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}