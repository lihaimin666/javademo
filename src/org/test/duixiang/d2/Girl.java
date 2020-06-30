package org.test.duixiang.d2;

public class Girl {

	
	private  String name;
	
	public void marry(Boy b) {
		System.out.println(this.name +" and "+b.getName()+"marry!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
