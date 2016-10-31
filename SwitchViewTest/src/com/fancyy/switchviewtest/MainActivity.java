package com.fancyy.switchviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.fancyy.switchview.SwitchView.OnSwitchChangeListener;
import com.fancyy.switchview.SwitchView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SwitchView switchView = (SwitchView) findViewById(R.id.switchview);
		switchView.setSwitchStatus(true);
		switchView.setOnSwitchChangeListener(new OnSwitchChangeListener() {
			@Override
			public void onSwitchChanged(boolean open) {
				Toast.makeText(MainActivity.this, "开关状态:" + open, Toast.LENGTH_SHORT).show();
			}
		});
	}
}
