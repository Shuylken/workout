package com.example.apple;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Wifi_Activity extends Activity {
	private Button btn_left;
	private Button btn_right;
	private TextView tv_title;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wifi_activity);

		String title = getResources().getString(R.string.title);
		String b = String.format(title, 2016);

		/*
		 * btn_left=(Button) findViewById(R.id.back);
		 * btn_right=(Button)findViewById(R.id.to);
		 * tv_title=(Button)findViewById(R.id.title_text);
		 * 
		 * btn_left.setText("����"); btn_right.setText("ˢ��");
		 */
		
	}
}
