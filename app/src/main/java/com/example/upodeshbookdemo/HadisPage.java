package com.example.upodeshbookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HadisPage extends AppCompatActivity {
    Button bukhari_Button,muslim_Button,dawet_Button,nasaya_Button,tirmigi_Button,ibnemaja_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis_page);

        ibnemaja_Button=findViewById(R.id.ibnemajaId);
        ibnemaja_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HadisPage.this,IbneMajaListPage.class);
                startActivity(intent);
            }
        });

        tirmigi_Button=findViewById(R.id.tirmijiId);
        tirmigi_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HadisPage.this,TirmijiListPage.class);
                startActivity(intent);
            }
        });

        nasaya_Button=findViewById(R.id.nasayeId);
        nasaya_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HadisPage.this,NasaiSorifListPage.class);
                startActivity(intent);
            }
        });

        dawet_Button=findViewById(R.id.dawudId);
        dawet_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HadisPage.this,AbudautListPage.class);
                startActivity(intent);
            }
        });


        muslim_Button=findViewById(R.id.muslimId);
        muslim_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HadisPage.this,MuslimListPage.class);
                startActivity(intent);
            }
        });

        bukhari_Button=(Button) findViewById(R.id.bukhariId);
        bukhari_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HadisPage.this,BukhariListPage.class);
                startActivity(intent);
            }
        });

    }
}