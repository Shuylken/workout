package com.example.apple;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends FourActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button11=(Button)findViewById(R.id.button11);
		Button button12=(Button)findViewById(R.id.to_Second);
		Button button13=(Button)findViewById(R.id.to_three);
		Button button14=(Button)findViewById(R.id.to_four);
		Button button15=(Button)findViewById(R.id.browser);
		
		button11.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.baidu.com"));
				startActivity(intent);
			}
		});

		button12.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,Choose_Fruits.class);
				startActivity(intent);
			}
			
		});
		
		button13.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:10086"));
				startActivity(intent);
			}
			
		});
		
		button14.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,Settings.class);
				startActivity(intent);
				Log.i("Settings", "to_settings.xml");
			}
			
		});
		
		button15.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,BrowserActivity.class);
				startActivity(intent);
				Log.i("Browser", "browser.xml");
			}
			
		});
	}

	// 按钮二添加事件
    public void onClick(View v) {
        // TODO Auto-generated method stub
		Toast.makeText(MainActivity.this, "这是按钮二", Toast.LENGTH_SHORT).show();

	}
}
