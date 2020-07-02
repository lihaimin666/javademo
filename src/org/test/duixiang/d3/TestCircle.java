package org.test.duixiang.d3;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder c  = new Cylinder();
		
		c.setRadius(9);
		c.setLength(5);
		
		System.out.println(c.findArea());
		System.out.println(c.findVolume());
	}

}
