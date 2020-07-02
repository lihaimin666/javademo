package org.test.duixiang.d3;

public class TestCPN1 {

	public static void main(String[] args) {
		Computer[] computer = {
				new PC(3000),new NotePad(6000),new Computer(5000),new PC(1000),new NotePad(89999),new Computer(40000)
		};
		
		
//		for (int i = 0; i < computer.length; i++) {
//			System.out.println(computer[i].price);
//		}
//		

		
		
		for (int i = 0; i < computer.length; i++) {
			for (int j = 0; j < computer.length-i-1; j++) {
				if(computer[j].price>computer[j+1].price) {
					Computer temp = computer[j];
					computer[j]= computer[j+1];
					computer[j+1]=temp;
				}
			}
		}
		
		for(Computer c:computer) {
			System.out.println(c.price);
		}
		
	}

}
