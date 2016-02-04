package com.example.emurillo.cambiaahora;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TestCigarrosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_cigarros);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView webview = (WebView) findViewById(R.id.webView1);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebChromeClient(new WebChromeClient());
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("file:///android_asset/www/test_adicciones/cigarros/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        WebView webview = (WebView) findViewById(R.id.webView1);
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webview.canGoBack()) {
            webview.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent intent = new Intent(TestCigarrosActivity.this, IndexActivity.class);
            startActivity(intent);
        } else if(id == R.id.index_test) {
            WebView webview = (WebView) findViewById(R.id.webView1);
            webview.getSettings().setJavaScriptEnabled(true);
            webview.setWebChromeClient(new WebChromeClient());
            webview.setWebViewClient(new WebViewClient());
            webview.loadUrl("file:///android_asset/www/test_adicciones/cigarros/index.html");
        }

        return super.onOptionsItemSelected(item);
    }

}
