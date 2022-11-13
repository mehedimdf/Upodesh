package com.example.upodeshbookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TirmijiListPage extends AppCompatActivity {
    ListView tirmijiListName;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tirmiji_list_page);

        tirmijiListName=findViewById(R.id.tirmijilistViewId);
        String[] tirmijiName=getResources().getStringArray(R.array.tirmiji_List_Names);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(TirmijiListPage.this,R.layout.list_view_demo,R.id.listViewId,tirmijiName);
        tirmijiListName.setAdapter(arrayAdapter);
    }
}