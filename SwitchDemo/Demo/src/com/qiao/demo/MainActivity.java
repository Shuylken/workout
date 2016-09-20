package com.qiao.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Transformation;


public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Animation animation = new Animation(){
        	@Override
        	protected void applyTransformation(float interpolatedTime,
        			Transformation t) {
        		Log.e("interpolatedTime", interpolatedTime+"");
        	}
        };
        animation.setDuration(500);
        final View view = findViewById(R.id.test);
        view.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				view.startAnimation(animation); 
			}
		});
    }
}
