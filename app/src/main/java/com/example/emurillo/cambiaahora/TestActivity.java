package com.example.emurillo.cambiaahora;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import java.util.Random;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                int x=rnd.nextInt(5)+1;
                switch(x){
                    case 1:
                        Intent intent1 = new Intent(TestActivity.this, TestCigarrosActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(TestActivity.this, TestAlcoholActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(TestActivity.this, TestMarihuanaActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(TestActivity.this, TestDrogaActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(TestActivity.this, TestActivity.class);
                        startActivity(intent5);
                        break;
                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent intent = new Intent(TestActivity.this, IndexActivity.class);
            startActivity(intent);
        } else if(id == R.id.index_test) {
            Intent intent1 = new Intent(TestActivity.this, TestActivity.class);
            startActivity(intent1);
        }

        return super.onOptionsItemSelected(item);
    }


}


