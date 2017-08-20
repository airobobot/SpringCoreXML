package com.asish.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Programme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Programme Start");
		
		ApplicationContext context= new ClassPathXmlApplicationContext("SpringConfiguration.xml");
		
		Shape shape=(Shape)context.getBean("triangle");
		
		shape.draw();
		
		shape=(Shape)context.getBean("circle");
		
		shape.draw();
		
		CircleConstructorValueInjection circleConstructorValueInjection=(CircleConstructorValueInjection)context.getBean("CircleConstructorValueInjection");
		
		circleConstructorValueInjection.display();
		
		PointRef pointRef=(PointRef)context.getBean("pointRefA");
		
		pointRef.display();
		
		
		TriangleAutowireExample triangleAutowireExample=(TriangleAutowireExample)context.getBean("TriangleAutowireExample");
		
		triangleAutowireExample.Display();
		
		//alias and qualifier
		
		
		
		TriangleAutowireQualifierValue triangleAutowireQualifierValue=(TriangleAutowireQualifierValue)context.getBean("TriangleAutowireQualifierValue");
		
		triangleAutowireQualifierValue.display();
		
		
		
		
		
		
	}
	

}
