package org.test.duixiang;

public class Animal {

	
	String classType;
	
	public Animal() {
		
	}
	public Animal(String c) {
		
		classType=c;
	}
	
	
	

	public void eat() {
		System.out.println("eating ");
	}
	
	public void sleep() {
		System.out.println("sleeping");
	}
	
	
	
	
	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}
}
