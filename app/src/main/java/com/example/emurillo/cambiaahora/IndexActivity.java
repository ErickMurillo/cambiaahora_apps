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
                 Random rnd = new Random();
                 int x=rnd.nextInt(5)+1;
                 switch(x){
                     case 1:
                         Intent intent1 = new Intent(IndexActivity.this, TestCigarrosActivity.class);
                         startActivity(intent1);
                         break;
                     case 2:
                         Intent intent2 = new Intent(IndexActivity.this, TestAlcoholActivity.class);
                         startActivity(intent2);
                         break;
                     case 3:
                         Intent intent3 = new Intent(IndexActivity.this, TestMarihuanaActivity.class);
                         startActivity(intent3);
                         break;
                     case 4:
                         Intent intent4 = new Intent(IndexActivity.this, TestDrogaActivity.class);
                         startActivity(intent4);
                         break;
                     case 5:
                         Intent intent5 = new Intent(IndexActivity.this, TestActivity.class);
                         startActivity(intent5);
                         break;
                 }

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
