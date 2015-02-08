package com.MyFirst.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class LifeCycleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_life_cycle);
		
		ShowMessage("On Create Activity Called.");
		
	}

	@Override
	protected void onStart() {
		super.onStart();
		
		ShowMessage("On Start Activity Called.");
		
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();

		ShowMessage("On Re-Start Activity Called.");
		
	}
	
	@Override
	protected void onResume() {
		super.onResume();

		ShowMessage("On Resume Activity Called.");
		
	}
	
	@Override
	protected void onPause() {
		super.onPause();

		ShowMessage("On Pause Activity Called.");
		
	}

	@Override
	protected void onStop() {
		super.onStop();

		ShowMessage("On Stop Activity Called.");
		
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();

		ShowMessage("On Destory Activity Called.");
		
	}
	
	private void ShowMessage(String message)
	{
		Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
	}
	
}


