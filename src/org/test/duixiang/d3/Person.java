package org.test.duixiang.d3;

public class Person {
	private String name;
	private int age;
	
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
		return "我是"+this.name+" 我的年龄是"+this.age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
