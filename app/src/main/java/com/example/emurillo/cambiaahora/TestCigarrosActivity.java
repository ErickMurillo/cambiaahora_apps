package com.example.emurillo.cambiaahora;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import junit.framework.Test;

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
        webview.setWebViewClient(new MyWebClientClass());
        webview.loadUrl("file:///android_asset/www/test_adicciones/cigarros/index.html");

        WebSettings settings = webview.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);

    }

    private class  MyWebClientClass extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            WebView webview = (WebView) findViewById(R.id.webView1);
            String webUrl = webview.getUrl();
            if (webUrl.equals("file:///android_asset/www/test_adicciones/cigarros/resultado.html")){
                Intent intent = new Intent(TestCigarrosActivity.this, TestActivity.class);
                startActivity(intent);
                return true;
            } else {
                return false;
            }

        }
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
            Intent intent1 = new Intent(TestCigarrosActivity.this, TestActivity.class);
            startActivity(intent1);
        }
        return super.onOptionsItemSelected(item);
    }

}
