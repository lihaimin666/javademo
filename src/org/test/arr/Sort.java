package org.test.arr;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number = {5,900,1,5,77,30,64,700};
		int [] n = new  int[8]; 
		Arrays.sort(number);
		System.out.println(Arrays.binarySearch(number, 77));
		Arrays.fill(number,9);
		
		System.arraycopy(number,0,n,0,8);
		
		
		System.out.println(Arrays.equals(number, n));
//		for(int i = 0; i < number.length; i++)
//			System.out.println(number[i]);
		
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}

	}

}
