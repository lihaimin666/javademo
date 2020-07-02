package org.test.duixiang.d3;

public class Circle {
	private double radius;
	
	
	Circle(){
		this.radius=1;
	}
	
	public double findArea() {
		
		return 3.1415*radius*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
