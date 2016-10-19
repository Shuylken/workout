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
		ToggleButton mTogBtn = (ToggleButton) findViewById(R.id.mTogBtn); // ��ȡ���ؼ�
		
		Button tv_click=(Button)findViewById(R.id.wifi_clock);
		//����wifi_activity
		tv_click.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i("WLAN_Click", "����Wifi_Activity");
				Intent intent = new Intent(Settings.this,Wifi_Activity.class);
				startActivity(intent);
				
			}
		});
		
		mTogBtn.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton mTogBtn, boolean isChecked) {
				// TODO Auto-generated method stub
				// ��������wifi״̬����ʾwifi������Ӧ״̬
				if (isChecked) {
					// ѡ��
					Log.i("wifi", "wifi�ѿ���");
					// �ر�Wifi����ť��ʾ����
					mWifiManager.setWifiEnabled(true);

				} else {
					// δѡ��
					Log.i("wifi", "wifi�ѹر�");
					// ����Wifi����ť��ʾ�ر�
					mWifiManager.setWifiEnabled(false);
				}
			}
		});// ��Ӽ����¼�
	}

	// �ж�wifi�Ƿ���
	public boolean isWifiOn() {
		if (mWifiManager == null) {
			mWifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);

		}
		return mWifiManager.isWifiEnabled();
	}
}