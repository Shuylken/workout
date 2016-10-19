package com.example.apple;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;

public class Settings extends Activity {

	private WifiManager mWifiManager;
	private Context context;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
		mWifiManager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
		ToggleButton mTogBtn = (ToggleButton) findViewById(R.id.mTogBtn); // 获取到控件
		
		Button tv_click=(Button)findViewById(R.id.wifi_clock);
		//进入wifi_activity
		tv_click.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i("WLAN_Click", "进入Wifi_Activity");
				Intent intent = new Intent(Settings.this,Wifi_Activity.class);
				startActivity(intent);
				
			}
		});
		
		mTogBtn.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton mTogBtn, boolean isChecked) {
				// TODO Auto-generated method stub
				// 启动需监测wifi状态，显示wifi开关相应状态
				if (isChecked) {
					// 选中
					Log.i("wifi", "wifi已开启");
					// 关闭Wifi，按钮显示开启
					mWifiManager.setWifiEnabled(true);

				} else {
					// 未选中
					Log.i("wifi", "wifi已关闭");
					// 开启Wifi，按钮显示关闭
					mWifiManager.setWifiEnabled(false);
				}
			}
		});// 添加监听事件
	}

	// 判断wifi是否开启
	public boolean isWifiOn() {
		if (mWifiManager == null) {
			mWifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);

		}
		return mWifiManager.isWifiEnabled();
	}
}