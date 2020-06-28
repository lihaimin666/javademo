package org.test.method;

public class TestTransfer1 {
	//传递地址，修改地址空间的值 
	public static void main(String[] args) {
		DataSwap ds = new DataSwap();
		ds.a = 6;
		ds.b = 9;
		swap(ds);
		System.out.println("交换结束后，a Field的值是" 
			+ ds.a + "；b Field的值是" + ds.b);
	}
	
	public static void swap(DataSwap swapname){
		int tmp = swapname.a;
		swapname.a = swapname.b;
		swapname.b = tmp;
		System.out.println("swap方法里，a Field的值是"
			+ swapname.a + "；b Field的值是" + swapname.b);
	}

}
