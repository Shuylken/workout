package com.example.listviewtest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private List<Fruit> fruitList = new ArrayList<Fruit>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initFruits();
		FruitAdapter adapter = new FruitAdapter(MainActivity.this,
				R.layout.fruit_item,fruitList);
		ListView listView = (ListView)findViewById(R.id.list_view);
		listView.setAdapter(adapter);
	}

	private void initFruits(){
		Fruit apple = new Fruit("Apple",R.drawable.ic_launcher);
		fruitList.add(apple);
		Fruit banana = new Fruit("banana",R.drawable.ic_launcher);
		fruitList.add(banana);
		Fruit orange = new Fruit("orange",R.drawable.ic_launcher);
		fruitList.add(orange);
		Fruit watrmelon = new Fruit("watrmelon",R.drawable.ic_launcher);
		fruitList.add(watrmelon);
		Fruit pear = new Fruit("pear",R.drawable.ic_launcher);
		fruitList.add(pear);
		Fruit grape = new Fruit("grape",R.drawable.ic_launcher);
		fruitList.add(grape);
		Fruit pineapple = new Fruit("pineapple",R.drawable.ic_launcher);
		fruitList.add(pineapple);
		Fruit strawberry = new Fruit("strawberry",R.drawable.ic_launcher);
		fruitList.add(strawberry);
		Fruit cherry = new Fruit("cherry",R.drawable.ic_launcher);
		fruitList.add(cherry);
		Fruit mango = new Fruit("mango",R.drawable.ic_launcher);
		fruitList.add(mango);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

public class Fruit{
	private String name;
	private int imageId;
	
	public Fruit(String name,int imageId){
		this.name = name;
		this.imageId = imageId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getImageId(){
		return imageId;
	}
}

public class FruitAdapter extends ArrayAdapter<Fruit>{
	private int resoutceId;
	public FruitAdapter(Context context,int textViewResourceId,List<Fruit> objects){
		super(context,textViewResourceId,objects);
	}
	@Override
	public View getView(int position,View convertView,ViewGroup parent){
		Fruit fruit = getItem(position);//获取当前项的Fruit实例
		View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
		ImageView fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
		TextView fruitName = (TextView)view.findViewById(R.id.fuit_name);
		fruitName.setText(fruit.getName());
		return view;
	}
}