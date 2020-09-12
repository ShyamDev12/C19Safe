package com.example.C19.Safegaurd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class three extends AppCompatActivity {
    //WebView webView1,webView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.mygov.in/covid-19");

        /*webView2=findViewById(R.id.webView2);



        WebSettings webSettings2=webView2.getSettings();
        webSettings2.setJavaScriptEnabled(true);
        webView2.loadUrl("https://www.mygov.in/covid-19");*/
    }
}