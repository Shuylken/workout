package com.example.apple;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

/*
 * 显示第tabhost 的第一个Activity，本activity 主要显示设备列表
 *
 * @author Administrator
 *
 */
public class BrowserActivity extends Activity {
	private WebView webView;
	private ProgressDialog mPgrogressDialog;
	private TextView tv_title;

	private Button btn_left;
	private Button btn_right;

	private String url = "https://www.baidu.com/";

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.browser_layout);

		// 获取传递的参数
		Intent it = getIntent();
		String u = it.getStringExtra("url");
		if (!TextUtils.isEmpty(u)) {
			url = u;
		}

		webView = (WebView) this.findViewById(R.id.webView);
		tv_title = (TextView) this.findViewById(R.id.title_text);
		btn_left = (Button) this.findViewById(R.id.back);
		btn_right = (Button) this.findViewById(R.id.to);

		btn_left.setVisibility(View.VISIBLE);
		btn_right.setVisibility(View.VISIBLE);
		btn_left.setText("返回");
		btn_right.setText("刷新");

		// 返回事件
		btn_left.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});

		// 刷新事件
		btn_right.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mPgrogressDialog.show();
				webView.loadUrl(url);
			}
		});

		// 显示网页加载中的小菊华花
		mPgrogressDialog = new ProgressDialog(this);
		mPgrogressDialog.setTitle("");
		mPgrogressDialog.setMessage("正在加载网页...");
		mPgrogressDialog.show();

		webView.getSettings().setDefaultTextEncodingName("gbk");

		// 在线程里启动网页加载
		new Thread(new Runnable() {
			@Override
			public void run() {
				webView.loadUrl(url);

			}
		}).start();

		webView.getSettings().setJavaScriptEnabled(true);

		webView.setWebChromeClient(new WebChromeClient() {
			@Override
			public void onReceivedTitle(WebView view, String title) {
				// TODO Auto-generated method stub
				super.onReceivedTitle(view, title);
				final String tmpTitle = title;
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						tv_title.setText(tmpTitle);
					}
				});
			}
		});

		webView.setWebViewClient(new WebViewClient() {
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				view.loadUrl(url);
				return true;
			}

			@Override
			public void onPageFinished(WebView view, String url) {

				super.onPageFinished(view, url);

				runOnUiThread(new Runnable() {

					@Override
					public void run() {
						mPgrogressDialog.dismiss();
					}
				});

			}

			@Override
			public void onPageStarted(WebView view, String url, Bitmap favicon) {
				super.onPageStarted(view, url, favicon);
			}
		});
	}
}