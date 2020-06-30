package org.test.duixiang.d2;

public class Person {
	String name;
	int age;
	
	public Person(){
		this.age=18;
	}
	Person(int age,String name){
		this.age=age;
		this.name = name;
	}
	public void getInfo(){	
		System.out.println("PersonÀà --> " + this.name) ; 
		
	}
	public boolean compare(Person p){
		
		return this.name==p.name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
}
