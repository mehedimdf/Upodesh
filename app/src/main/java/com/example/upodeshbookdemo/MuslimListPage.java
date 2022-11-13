package com.example.upodeshbookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MuslimListPage extends AppCompatActivity {
    ListView muslimListName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muslim_list_page);

        muslimListName=findViewById(R.id.muslimlistViewId);
        String[] muslimName=getResources().getStringArray(R.array.muslim_List_Names);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(MuslimListPage.this,R.layout.list_view_demo,R.id.listViewId,muslimName);
        muslimListName.setAdapter(arrayAdapter);

    }
}