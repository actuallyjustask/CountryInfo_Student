package edu.monash.fit2081.countryinfo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WikiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        getSupportActionBar().setTitle(R.string.title_activity_wiki_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String urlToLaunch = bundle.getString("urlToLaunch");


            WebView myWebView = findViewById(R.id.webView);
            myWebView.setWebViewClient(new WebViewClient());
            myWebView.loadUrl(urlToLaunch);

        }
    }
}
