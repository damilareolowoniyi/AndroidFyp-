package Classes;

import java.io.Serializable;

import android.R.string;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String _name;
	
	private String _address;
	
	public Student(){}
	public Student(String name, String address){
		_name = name;
		_address = address;
	}
	
	public void setName(String name){
		_name = name;
	}
	
	public String getName(){
		return _name;
	}
	
	public void setAddress(String address){
		_address = address;
	}
	
	public String getAddress(){
		return _address;
	}
	
	
}
