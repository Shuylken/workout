package com.example.uiwidgettest;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public abstract class MainActivity extends Activity implements OnClickListener {
	private Button button;
	public EditText editText;
	private ProgressBar progressBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button)findViewById(R.id.button);
		editText = (EditText)findViewById(R.id.edit_text);
		progressBar = (ProgressBar)findViewById(R.id.progress_bar);
		button.setOnClickListener((android.view.View.OnClickListener) this);
	}
	
	public void onClick(View v){
		switch (v.getId()){
		case R.id.button:
			if (progressBar.getVisibility() == View.GONE){
				progressBar.setVisibility(View.VISIBLE);
			}else{
				progressBar.setVisibility(View.GONE);
			}
			break;
			default:
				break;
		}
		
	}
}
