package com.asish.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TriangleAutowireQualifierValue {

	@Autowired
	@Qualifier("pointA")
	private Point pointM;

	
	
	public Point getPointM() {
		return pointM;
	}

	
	public void setPointM(Point pointM) {
		this.pointM = pointM;
	}
	
	public void display()
	{
		System.out.println("PointM");
		System.out.println(pointM.getX());
	}
	
}
