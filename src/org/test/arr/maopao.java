package org.test.arr;

public class maopao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr ={80,57,97,66,88};
		int[] arr = {22,17,29,35,6};
		int temp=0;
//		 for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j <arr.length; j++) {
//				if(arr[i]>arr[j]) {
//					temp =arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		 // ц╟ещ
		 for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j <arr.length-i-1; j++) {
					if(arr[j]>arr[j+1]) {
						temp =arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
		 }
		 
		 
		 for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
	}

}
