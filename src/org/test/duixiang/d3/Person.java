package org.test.duixiang.d3;

public class Person {
	String name;
	int age;
	
	Person(){
		
	}
	Person(String name){
		this.name=name;
		this.age=12;
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String say() {
		return "����"+this.name+" �ҵ�������"+this.age;
	}
	
	
}
