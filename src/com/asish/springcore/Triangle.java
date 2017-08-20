package com.asish.springcore;

public class Triangle implements Shape{

	
	
	private String Type;
	
	
	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public void draw() {
		System.out.println("Triangel Drawn of"+" "+ getType());
		
	}
	
	

}
