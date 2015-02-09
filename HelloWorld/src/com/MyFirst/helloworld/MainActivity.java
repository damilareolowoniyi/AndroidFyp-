package com.MyFirst.helloworld;

import java.io.Serializable;

import Classes.Student;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder.DeathRecipient;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
			
		setContentView(R.layout.activity_main);
		
		initializeControls();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		boolean handled = false;
		
		int id = item.getItemId();
		
		switch(id)
		{
			case R.id.menu_settings:
				{
					Toast.makeText(this, "Clicked on setting menu item again.", Toast.LENGTH_SHORT).show();
					handled = true;
					break;
				}
			
			case R.id.menu_other:
				{
					onOpenActivity();
					handled = true;
					break;
				}

			case R.id.menu_exit:
				{
					finish();
					handled = true;
					break;
				}
				default:
				{
					handled =  super.onOptionsItemSelected(item);
				}
		}
		
		return handled;
		
	}
	
	
	private void initializeControls()
	{
		Button btnPhoneCall = (Button)findViewById(R.id.btn_phone_call);
		Button btnMap = (Button)findViewById(R.id.btn_map_application);
		Button btnOpenActivity = (Button)findViewById(R.id.btn_open_activity);
		Button btnSave = (Button)findViewById(R.id.btn_save);
		
		// set on click event using in line implementation technique
		btnPhoneCall.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onPhoneCallClick();
			}
		});
		
		
		btnMap.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				onMapClick();
				
			}
		});
		
		btnOpenActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onOpenActivity();
			}
		});
		
		btnSave.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onSaveClick();
			}
		});
		
	}
	
	private void onPhoneCallClick(){
		
	    Uri uri = Uri.parse("tel:03361122334");
	    
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);

        startActivity(intent);    

	}
	
	private void onMapClick(){

		  Uri geoUri = Uri.parse("geo:42.374260,-71.120824");

          Intent mapIntent = new Intent(Intent.ACTION_VIEW, geoUri);

          startActivity(mapIntent);
	}
	
	private void onOpenActivity(){
		
		Intent intent = new Intent(this, LifeCycleActivity.class);
		startActivity(intent);
	}

	private void onSaveClick(){
		
		Student std = getStudent();
		
		Intent intent = new Intent(this, DetailActivity.class);
		intent.putExtra("student", (Serializable)std);
		startActivity(intent);
		
	}
	
	
	private Student getStudent()
	{
		Student std = new Student();
		
		
		EditText txtName = (EditText)findViewById(R.id.txt_name);
		EditText txtAddress = (EditText)findViewById(R.id.txt_address);
		
		String name = txtName.getText().toString(); 
		String address = txtAddress.getText().toString(); 
		
		std.setName(name);
		std.setAddress(address);
		
		return std;
	}
	
}
