package com.example.upodeshbookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AllaherNamesPage extends AppCompatActivity {
    ListView allaherNameListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allaher_names_page);

        allaherNameListView=(ListView) findViewById(R.id.allaherNamelistViewId);
        String[] allaherNames=getResources().getStringArray(R.array.allher_Names);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(AllaherNamesPage.this,R.layout.list_view_demo,R.id.listViewId,allaherNames);
        allaherNameListView.setAdapter(arrayAdapter);
    }
}