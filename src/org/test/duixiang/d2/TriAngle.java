package org.test.duixiang.d2;

public class TriAngle {

	
	private double base;
	private double height;
	private double area;
	
	TriAngle(){
		
	}
	TriAngle(int base,int height){
		this.base=base;
		this.height=height;
	}
	
	
	public double jisuanmj() {
		return base*height/2;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	
}
