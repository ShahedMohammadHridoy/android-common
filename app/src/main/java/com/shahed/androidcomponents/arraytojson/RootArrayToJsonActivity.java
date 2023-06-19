package com.shahed.androidcomponents.arraytojson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.shahed.androidcomponents.R;
import com.shahed.androidcomponents.arraytojson.model.ItemModel;

import org.json.JSONArray;

import java.util.ArrayList;

public class RootArrayToJsonActivity extends AppCompatActivity {

    TextView output;
    ArrayList<ItemModel> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root_array_to_json);

        output = findViewById(R.id.output);

        itemList = new ArrayList<>();
        ItemModel item1 = new ItemModel("1", "Shahed", "Android App");
        ItemModel item2 = new ItemModel("2", "Jahed", "iOS App");
        ItemModel item3 = new ItemModel("3", "Rashed", "Windows App");
        ItemModel item4 = new ItemModel("4", "Alam", "Web App");
        ItemModel item5 = new ItemModel("5", "Kalam", "Cross Platform App");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);

        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < itemList.size(); i++) {
            jsonArray.put(itemList.get(i).getJsonObject());
        }

        output.setText(jsonArray.toString());


    }
}