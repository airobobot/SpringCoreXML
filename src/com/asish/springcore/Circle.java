package com.asish.springcore;

public class Circle implements Shape{

	
private String Type;

private int radius;
	
	
	public int getRadius() {
	return radius;
}


public void setRadius(int radius) {
	this.radius = radius;
}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public void draw() {
		System.out.println("Circle Drawn of Type" +" "+getType() +" "+"and radius of"+" "+getRadius()+ "cm");
		
	}
}
