package com.asish.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TriangleAutowireExample implements ApplicationContextAware,BeanNameAware {

	private Point pointA;
	private Point pointB;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public void Display()
	{
		
		System.out.println("Point A" + " "+ pointA.getX()+" "+ pointA.getY()+" "+pointA.getZ());
		
		System.out.println("Point B" + " "+ pointB.getX()+" "+ pointB.getY()+" "+pointB.getZ());
	}
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0+"bean name"+" ");
		
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println(arg0+"appliation context name"+" ");
		
	}
	
	
	
	
}
