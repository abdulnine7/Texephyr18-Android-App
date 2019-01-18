package com.abdul.app.texephyr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

/**
 * @author Abdul Noushad (abdulnine7)
 */

public class WebActivity extends AppCompatActivity {
    int action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        action = Integer.parseInt(getIntent().getStringExtra("action"));

        WebView webView = (WebView) findViewById(R.id.webView);
        assert webView != null;
        webView.setWebViewClient(new MyBrowser());
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.canGoBack();

        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);

        webView.setWebChromeClient(new WebChromeClient(){

            public void onProgressChanged(WebView view, int newProgress){
                // Update the progress bar with page loading progress
                assert progressBar != null;
                progressBar.setVisibility(View.VISIBLE);
                progressBar.setProgress(newProgress);
                if(newProgress == 100){
                    // Hide the progressbar
                    progressBar.setVisibility(View.GONE);
                }
            }
        });

        if (action == 0)
            webView.loadUrl("https://www.texephyr.in/man19/volunteer_login.html");
        else
            webView.loadUrl("https://texephyr.in");
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
