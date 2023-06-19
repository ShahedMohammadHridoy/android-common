package com.shahed.androidcomponents.arraytojson.model;

import org.json.JSONException;
import org.json.JSONObject;

public class ItemModel {

    private final String itemId;
    private final String itemName;
    private final String itemCategory;

    public ItemModel(String itemId, String itemName, String itemCategory) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemCategory = itemCategory;
    }

    public JSONObject getJsonObject() {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("id", itemId);
            jsonObject.put("name", itemName);
            jsonObject.put("category", itemCategory);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        return jsonObject;
    }
}
