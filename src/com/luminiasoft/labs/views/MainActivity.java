package com.luminiasoft.labs.views;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View.OnClickListener;

import android.app.Activity;

import android.content.Context;

import android.graphics.Canvas;

import android.graphics.Color;

import android.graphics.Paint;

import android.graphics.Path;

import android.graphics.RectF;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	private static final String TAG = "MainActivity";

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    @Override
    public void onStart(){
    	super.onStart();
    	final Speedometer speedometer = (Speedometer) findViewById(R.id.Speedometer);
        Button increaseSpeed = (Button) findViewById(R.id.IncreaseSpeed);
        Button decreaseSpeed = (Button) findViewById(R.id.DecreaseSpeed);
        increaseSpeed.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View view) {
				speedometer.onSpeedChanged(speedometer.getCurrentSpeed()+8);
			}
        	
        });
        decreaseSpeed.setOnClickListener(new OnClickListener(){
        	
			@Override
			public void onClick(View v) {
				speedometer.onSpeedChanged(speedometer.getCurrentSpeed()-8);
			}
        });
    }
}
