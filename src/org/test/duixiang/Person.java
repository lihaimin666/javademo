package org.test.duixiang;



public class Person {

	
	private int age;
	private int nl;
	
	 Person() {
		
	}
	
	public Person(int age,int nl) {
		
		this.age =age;
		this.nl=nl;
	}

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
