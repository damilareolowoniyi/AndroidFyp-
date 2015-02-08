package com.MyFirst.helloworld;


import Classes.Student;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		
		getDataFromBundle();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_detail, menu);
		return true;
	}
	
	private void getDataFromBundle()
	{
		
		Bundle bundle = this.getIntent().getExtras();
        
		Student std = (Student)bundle.getSerializable("new student");
	
		SetStudentInformation(std);
		
		
		//Toast.makeText(this,name, Toast.LENGTH_SHORT).show();
    
	}
	
	private void SetStudentInformation(Student std)
	{
		TextView txtName = (TextView)findViewById(R.id.txtYourName);
		TextView txtAddress = (TextView)findViewById(R.id.txtYourAddress);
		
		txtName.setText(std.getName());
		txtAddress.setText(std.getAddress());
		
		
	}
	


}
