package org.test.arr;

public class Arr2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] j= new int[5][6];
		
		for (int i = 0; i <5; i++) {
			for (int k = 0; k <6; k++) {
				j[i][k]=i+k;
				
				System.out.print(j[i][k]);
			}
			System.out.println();
		}
		
		
//		for (int i = 0; i < 5; i++) {
//			for (int k = 0; k <6; k++) {
//				
//				System.out.print(j[i][k]);
//			}
//			System.out.println();
//		}
	}

}
