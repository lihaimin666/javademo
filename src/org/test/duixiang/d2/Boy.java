package org.test.duixiang.d2;

public class Boy {
	private int age;
	private String name;
	
	public void marry(Girl g) {
		
		System.out.println(this.name +" and "+g.getName()+"marry!");
	}
	
	public void  shout(Girl g) {
		System.out.println(this.name +" and "+g.getName()+"shout!");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
