package org.test.duixiang.d3;

public class Cylinder extends Circle {

	
	private double length;
	
	
	Cylinder(){
		this.length=1;
		
	}
	
	public double findVolume(){
		
		return super.findArea()*this.length;
	}

	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}
	
	
}
