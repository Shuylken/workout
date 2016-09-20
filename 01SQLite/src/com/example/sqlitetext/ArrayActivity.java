package com.example.sqlitetext;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ArrayActivity extends Activity {

	private String[] strs = new String[] { "first", "second", "third", "fourth", "fifth" };
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button1 = (Button)findViewById(R.id.Button1);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ArrayActivity.this,SimpleActivity.class);
				startActivity(intent);
			}
		});
		ListView lv = (ListView) findViewById(R.id.lv);// 得到ListView对象的引用
		// /*为ListView设置Adapter来绑定数据*/
		lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strs));

		lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, strs));
		lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		
		lv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0,View arg1,int arg2,long arg3){
				//点击后在标题上显示点击了第几行
				setTitle("你点击了第"+(arg2+1)+"行");
			}
		});
	}
}