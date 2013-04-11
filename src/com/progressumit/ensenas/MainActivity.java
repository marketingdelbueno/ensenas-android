package com.progressumit.ensenas;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
	private WebView browser = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		browser = (WebView) findViewById(R.id.mainWebView);

		WebSettings settings = browser.getSettings();
		settings.setPluginsEnabled(true);
		settings.setJavaScriptEnabled(true);
		
		browser.setWebViewClient(new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                return false;
            }   
        });
		
		browser.loadUrl("http://videodiccionario.net/");
	}
	
}
