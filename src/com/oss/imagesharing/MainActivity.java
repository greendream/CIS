package com.oss.imagesharing;

import org.apache.cordova.*;

import android.os.Bundle;

public class MainActivity extends DroidGap {

	@Override
	protected void showSplashScreen(int time) {
		// TODO Auto-generated method stub
		super.showSplashScreen(time);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
	}
    
}
