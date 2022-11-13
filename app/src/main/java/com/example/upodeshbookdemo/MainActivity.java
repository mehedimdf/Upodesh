package com.example.upodeshbookdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    int progress;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        progressBar=(ProgressBar)findViewById(R.id.progressBarId);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                stratApp();
            }
        });
        thread.start();

    }
    public void doWork(){
        for (progress=30; progress<=100;progress=progress+30){
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public void stratApp(){
        Intent intent=new Intent(MainActivity.this,CategoryNames.class);
        startActivity(intent);
        finish();
    }
}