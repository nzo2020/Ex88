package com.example.ex8;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.webkit.WebSettings;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    WebView webV;
    EditText eText;






    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webV = (WebView) findViewById(R.id.webV);
        eText = findViewById(R.id.eText);
        WebSettings webSettings = webV.getSettings();
        webV.setWebViewClient(new MyWebViewClient());

        btn = findViewById(R.id.btn);



    }

    public void go(View view) {
        String st = eText.getText().toString();
        webV.loadUrl(st);

    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;

        }
    }
}