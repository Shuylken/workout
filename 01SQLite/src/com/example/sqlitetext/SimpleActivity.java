package com.example.sqlitetext;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;

public class SimpleActivity extends Activity {

	private ListView lv;

public SimpleActivity(SimpleActivity simpleAdapter, ArrayList<HashMap<String, Object>> listItem, int simpleItem,
			String[] strings, int[] is) {
		// TODO Auto-generated constructor stub
	}

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);
        /*定义一个动态数组*/
          ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String,Object>>();
          /*在数组中存放数据*/
          for(int i=0;i<10;i++)  
        {  
            HashMap<String, Object> map = new HashMap<String, Object>();  
            map.put("ItemImage", R.drawable.ic_launcher);//加入图片
            map.put("ItemTitle", "第"+i+"行");  
            map.put("ItemText", "这是第"+i+"行");  
            listItem.add(map);  
        } 
          
        SimpleActivity mSimpleAdapter = new SimpleActivity(this,listItem,//需要绑定的数据
                R.layout.simple_item,//每一行的布局
                //动态数组中的数据源的键对应到定义布局的View中
                new String[]{"ItemImage","ItemTitle", "ItemText"},   
                new int[] {R.id.ItemImage,R.id.ItemTitle,R.id.ItemText}  
        		);

        lv.setAdapter((ListAdapter) mSimpleAdapter);//为ListView绑定适配器
        
        lv.setOnItemClickListener(new OnItemClickListener() {
        	
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                    long arg3) {
                setTitle("你点击了第"+arg2+"行");//设置标题栏显示点击的行
                
            }
        });
    }
}