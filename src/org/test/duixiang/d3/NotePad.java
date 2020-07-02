package org.test.duixiang.d3;

public class NotePad extends Computer {
	String file;
	String menu;
	
	public String getDetails() {
		
		return super.getDetails()+file+menu;
	}
}
