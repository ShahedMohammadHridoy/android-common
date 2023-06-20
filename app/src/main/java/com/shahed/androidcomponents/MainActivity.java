package com.shahed.androidcomponents;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.shahed.androidcomponents.arraytojson.RootArrayToJsonActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonCommon, buttonText, buttonButton, buttonContainers, buttonArrayToJson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Initialization
        buttonCommon = findViewById(R.id.button_common);
        buttonText = findViewById(R.id.button_text);
        buttonButton = findViewById(R.id.button_button);
        buttonContainers = findViewById(R.id.button_containers);
        buttonArrayToJson = findViewById(R.id.button_array_to_json);

//        Click listener
        buttonCommon.setOnClickListener(v -> startActivity(new Intent(this, RootCommonActivity.class)));
        buttonText.setOnClickListener(view -> startActivity(new Intent(this, RootTextActivity.class)));
        buttonButton.setOnClickListener(view -> startActivity(new Intent(this, RootButtonActivity.class)));
        buttonContainers.setOnClickListener(view -> startActivity(new Intent(this, RootContainersActivity.class)));
        buttonArrayToJson.setOnClickListener(view -> startActivity(new Intent(this, RootArrayToJsonActivity.class)));

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