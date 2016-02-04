package com.example.emurillo.cambiaahora;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

         Button button = (Button)findViewById(R.id.test);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent1 = new Intent(IndexActivity.this, TestActivity.class);
                 startActivity(intent1);

             }
         });

        Button buttonDirectorio = (Button)findViewById(R.id.directorio);
        buttonDirectorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, DirectorioActivity.class);
                startActivity(intent);
            }
        });
    }


}
