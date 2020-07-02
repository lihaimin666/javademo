package org.test.duixiang.d3;

public class Manager extends Employee {
	int numsOfReports = 250;
	int officeID = 123;
	float bonus = 1000.0f;
	Manager(){
		
	}
	public Manager(int numsOfReports, int officeID,  float bonus) {
//         super();
	     this.numsOfReports = numsOfReports;
         this.officeID = officeID;
         this.bonus = bonus;
	}

	public String receivesPay() {
        return " receivesPay:" + getName() +
               " salary = " + getSalary() + " bonus =" + bonus;
	}

	 public void hires() {
		 System.out.println("hires");
	 }
	 
	 public void plans() {
		 System.out.println("plans");
	 }
}
