package org.test.duixiang.d3;

public class Employee {

	private String name = "����";
	private String address;
	private float salary;

	Employee(){
		this.name = "����";
		this.address = "����";
		this.salary = 12000.0f;
	}
	
	Employee(String name){
		this.name=name;
		this.address ="����";
		this.salary= 120000.0f;
	}
	
	public String receivesPay() {
		  return "receivesPay:" + name + " salary = " + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}


}
