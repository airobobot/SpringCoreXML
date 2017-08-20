package com.asish.springcore;

public class CircleConstructorValueInjection {

	private String name;

	public String getName() {
		return name;
	}

	
	
	public CircleConstructorValueInjection(String name) {
		//super();
		this.name = name;
	}



	public void display()
	{
		
		System.out.println("Display Name as" +" "+ getName());
	}
	
}
