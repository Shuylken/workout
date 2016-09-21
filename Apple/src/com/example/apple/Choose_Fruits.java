package com.example.apple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

public class Choose_Fruits extends ListActivity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// ����Adapter
		SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.fruits_item,
				new String[] { "img", "title", "info" }, new int[] { R.id.img, R.id.title, R.id.info });
		setListAdapter(adapter);
	}
	private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "С��");
        map.put("info", "��̨DJ");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "����");
        map.put("info", "�Ĵ���Ů");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "�̲�");
        map.put("info", "�崿����");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "���");
        map.put("info", "��С��");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "hello");
        map.put("info", "every thing");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "world");
        map.put("info", "hello world");
        list.add(map);

        return list;
    }
}
