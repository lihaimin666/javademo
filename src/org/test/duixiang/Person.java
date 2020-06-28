package org.test.duixiang;

public class Person {

	
	private int age;
	


	public void sleep() {
		System.out.println("sleep");
	}
	

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		if(age<1||age>130) {
			System.out.println("age is error! ");
			return;
		}
		this.age = age;
	}
}
