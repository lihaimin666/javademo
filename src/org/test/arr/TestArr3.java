package org.test.arr;

public class TestArr3 {

	public static void main(String[] args) {
		int[] arr = new int[20];
		TestArr3 t = new TestArr3();
		t.isArray(arr);
	}

	public void isArray(int[] arr) {

		for (int i = 0; i < 20; i++) {
			if(i==0) {
				arr[i] = arr[i] + 2;
			}else {
				arr[i]= arr[i-1]+2;
			}
			System.out.println(arr[i]);
		}
	}

}
