package com.example.upodeshbookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BukhariListPage extends AppCompatActivity {
    ListView bukhariListName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukhari_list_page);

        bukhariListName=(findViewById(R.id.bukharilistViewId));
        String[] bukhariName=getResources().getStringArray(R.array.bukhari_List_Names);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(BukhariListPage.this,R.layout.list_view_demo,R.id.listViewId,bukhariName);
        bukhariListName.setAdapter(arrayAdapter);
    }
}