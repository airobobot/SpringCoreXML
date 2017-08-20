package com.asish.springcore;

import java.util.List;

public class PointRef {

	
	public Point pointA;
	public Point pointB;
	public Point pointC;
	
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

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public List<Point> getPointD() {
		return pointD;
	}

	public void setPointD(List<Point> pointD) {
		this.pointD = pointD;
	}

	public List<Point> pointD;
	
	public void display()
	{
		System.out.println("Evaluate D:Start");
		for(Point a:pointD)
		{
			System.out.println("value"+" "+(a.getX()+" ,"+a.getY()));
		}
		
		System.out.println(pointC.getX()+" "+pointC.getY());
		
	}
	
}
