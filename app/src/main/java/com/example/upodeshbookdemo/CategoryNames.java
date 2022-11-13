package com.example.upodeshbookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoryNames extends AppCompatActivity {
    Button nammajerTime_Button;
    Button namajerNiyom_Button;
    Button ojurNiyom_Button, gosolerNiyom_Button, kalima_Button, allherName_Button, hadisName_Button, quran_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_names);

        quran_Button=(Button)findViewById(R.id.quranId);
        quran_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CategoryNames.this,QuranFilePage.class);
                startActivity(intent);
            }
        });

        hadisName_Button=(Button)findViewById(R.id.hadisId);
        hadisName_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CategoryNames.this,HadisPage.class);
                startActivity(intent);
            }
        });

        allherName_Button=(Button)findViewById(R.id.allaherNameId);
        allherName_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CategoryNames.this,AllaherNamesPage.class);
                startActivity(intent);
            }
        });


        namajerNiyom_Button=(Button)findViewById(R.id.namajerNiyomId);
        namajerNiyom_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(CategoryNames.this,NamajerNiyomPage.class);
                startActivity(intent);
            }
        });

        nammajerTime_Button=(Button) findViewById(R.id.namajerTimeId);
        nammajerTime_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CategoryNames.this,NamajerTimePage.class);
                startActivity(intent);
            }
        });
        ojurNiyom_Button=(Button) findViewById(R.id.ojurNiyomId);
        ojurNiyom_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CategoryNames.this,OjurNiyomPage.class);
                startActivity(intent);
            }
        });

        gosolerNiyom_Button=(Button) findViewById(R.id.gosolerNiyomId);
        gosolerNiyom_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CategoryNames.this,GosolerNiyomPage.class);
                startActivity(intent);
            }
        });
        kalima_Button=(Button) findViewById(R.id.kalimaId);
        kalima_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CategoryNames.this,KalimaPage.class);
                startActivity(intent);
            }
        });
    }
}
