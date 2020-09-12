package com.example.C19.Safegaurd;

/*import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class xo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xo);
    }
}*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class xo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xo);
        WebView webView = new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.crazygames.com/game/uno-online");
    }
}