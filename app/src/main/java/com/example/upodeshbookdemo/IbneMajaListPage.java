package com.example.upodeshbookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IbneMajaListPage extends AppCompatActivity {
    ListView ibnemajaListName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibne_maja_list_page);

        ibnemajaListName=findViewById(R.id.ibnemajalistViewId);
        String[] ibnemajaName=getResources().getStringArray(R.array.ibnemaja_List_Names);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(IbneMajaListPage.this,R.layout.list_view_demo,R.id.listViewId,ibnemajaName);
        ibnemajaListName.setAdapter(arrayAdapter);
    }
}