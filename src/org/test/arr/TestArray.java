package org.test.arr;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array2;
		int[] array1 = {2,3,5,7,11,13,17,19};
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print(" "+array1[i]);
		}
		System.out.println();
		array2 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			if(i%2==0) {
				array2[i]=i;
			}else {
				array2[i]=array1[i];
			}
			
		}
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print(" "+array2[i]);
		}
		
		
		
		
	}

}
