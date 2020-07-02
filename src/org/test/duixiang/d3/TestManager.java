package org.test.duixiang.d3;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Manager  m = new Manager();
//		m.setSalary(2000);
		
		Manager m = new Manager(100, 20, 10001.0f); 
		System.out.println(m.receivesPay());
		
		
	}

}
