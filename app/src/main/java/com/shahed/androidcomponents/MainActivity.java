package com.shahed.androidcomponents;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.shahed.androidcomponents.arraytojson.RootArrayToJsonActivity;

public class MainActivity extends AppCompatActivity {

    Button button_common, button_text, button_button, button_array_to_json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Initialization
        button_common = findViewById(R.id.button_common);
        button_text = findViewById(R.id.button_text);
        button_button = findViewById(R.id.button_button);
        button_array_to_json = findViewById(R.id.button_array_to_json);


        button_common.setOnClickListener(v -> {
            Intent intent = new Intent(this, RootCommonActivity.class);
            startActivity(intent);
        });
        button_text.setOnClickListener(view -> {
            Intent intent = new Intent(this, RootTextActivity.class);
            startActivity(intent);
        });
        button_button.setOnClickListener(view -> {
            Intent intent = new Intent(this, RootButtonActivity.class);
            startActivity(intent);
        });
        button_array_to_json.setOnClickListener(view -> {
            Intent intent = new Intent(this, RootArrayToJsonActivity.class);
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