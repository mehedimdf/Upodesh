package com.example.upodeshbookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AbudautListPage extends AppCompatActivity {
    ListView dawatListName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abudaut_list_page);

        dawatListName=findViewById(R.id.dawatlistViewId);
        String[] dawatName=getResources().getStringArray(R.array.dawat_List_Names);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(AbudautListPage.this,R.layout.list_view_demo,R.id.listViewId,dawatName);
        dawatListName.setAdapter(arrayAdapter);
    }
}