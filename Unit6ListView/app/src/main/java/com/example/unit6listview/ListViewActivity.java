package com.example.unit6listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = findViewById(R.id.listView);
        String[] items = {
                "Pokhara",
                "Kathmandu",
                "Butwal",
                "Sindhuli", "Dharan", "Pokhara",
                "Kathmandu",
                "Butwal",
                "Sindhuli", "Dharan", "Pokhara",
                "Kathmandu",
                "Butwal",
                "Sindhuli", "Dharan", "Pokhara",
                "Kathmandu",
                "Butwal",
                "Sindhuli", "Dharan"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(
                this, R.layout.listview_item, R.id.titleText, items);
        listView.setAdapter(arrayAdapter);
    }
}