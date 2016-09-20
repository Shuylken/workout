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
        /*����һ����̬����*/
          ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String,Object>>();
          /*�������д������*/
          for(int i=0;i<10;i++)  
        {  
            HashMap<String, Object> map = new HashMap<String, Object>();  
            map.put("ItemImage", R.drawable.ic_launcher);//����ͼƬ
            map.put("ItemTitle", "��"+i+"��");  
            map.put("ItemText", "���ǵ�"+i+"��");  
            listItem.add(map);  
        } 
          
        SimpleActivity mSimpleAdapter = new SimpleActivity(this,listItem,//��Ҫ�󶨵�����
                R.layout.simple_item,//ÿһ�еĲ���
                //��̬�����е�����Դ�ļ���Ӧ�����岼�ֵ�View��
                new String[]{"ItemImage","ItemTitle", "ItemText"},   
                new int[] {R.id.ItemImage,R.id.ItemTitle,R.id.ItemText}  
        		);

        lv.setAdapter((ListAdapter) mSimpleAdapter);//ΪListView��������
        
        lv.setOnItemClickListener(new OnItemClickListener() {
        	
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                    long arg3) {
                setTitle("�����˵�"+arg2+"��");//���ñ�������ʾ�������
                
            }
        });
    }
}