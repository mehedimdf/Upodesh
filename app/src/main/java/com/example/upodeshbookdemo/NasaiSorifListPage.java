package com.example.upodeshbookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NasaiSorifListPage extends AppCompatActivity {
    ListView nasaisorifListName;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasai_sorif_list_page);

        nasaisorifListName=findViewById(R.id.nasaisoriflistViewId);
        String[] nasaisorifName=getResources().getStringArray(R.array.nasaisorf_List_Names);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(NasaiSorifListPage.this,R.layout.list_view_demo,R.id.listViewId,nasaisorifName);
        nasaisorifListName.setAdapter(arrayAdapter);
    }
}