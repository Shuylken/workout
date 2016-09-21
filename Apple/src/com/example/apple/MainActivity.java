package com.example.apple;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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
	}

	// 按钮二添加事件
    public void onClick(View v) {
        // TODO Auto-generated method stub
        Toast.makeText(MainActivity.this, "这是按钮二", Toast.LENGTH_SHORT).show();

    }
}
