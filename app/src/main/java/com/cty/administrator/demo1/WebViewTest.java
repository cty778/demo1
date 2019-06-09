package com.cty.administrator.demo1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import java.io.InputStream;

public class WebViewTest extends AppCompatActivity {
    private String url = "http://www.tianheoil.com/EN/";
    private WebView webView;
    private ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_test);
        init();
//        Uri uri =  Uri.parse(url);
//        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
//        startActivity(intent);
    }

    private void init() {
        webView = (WebView) findViewById(R.id.webView);
//        webView.loadUrl(url);
        webView.loadUrl(url);

//        webView.loadUrl("file:///android_asset/example.html");
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                //方法返回true 表示调用webview本身; false表示调用系统默认浏览器
                ///return super.shouldOverrideUrlLoading(view, request);
                view.loadUrl(url);
                return true;
            }
        });
        //启用支持javascript
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
//                super.onProgressChanged(view, newProgress);
                if(newProgress==100){
                    //网页加载完毕
                    closeDialog();
                }else{
                    //网页正在加载
                    openDirlog(newProgress);
                }
            }

            private void openDirlog(int newProgress) {
                if(dialog==null){
                    dialog= new ProgressDialog(WebViewTest.this);
                    dialog.setTitle("正在加载");
                    dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                    dialog.setProgress(newProgress);

                }
            }

            private void closeDialog() {
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            if(webView.canGoBack()){
                webView.goBack();
                return true;
            }else{
                System.exit(0);
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
