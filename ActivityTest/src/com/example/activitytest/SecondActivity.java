package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
	
	Button button21 = (Button)findViewById(R.id.button_21);
	Button button22 = (Button)findViewById(R.id.button_22);
	
	button21.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(SecondActivity.this,FristActivity.class);
			startActivity(intent);
		}
	});
	
button22.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent =new Intent();
			intent.putExtra("data_return", "Hello FristActivity");
			setResult(RESULT_OK,intent);
			finish();
		}
	});
	}
	@Override
	public void onBackPressed() {
		Intent intent = new Intent();
		intent.putExtra("data_return", "Hello FirstActivity");
		setResult(RESULT_OK,intent);
		finish();
	}
}
