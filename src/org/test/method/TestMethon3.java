package org.test.method;

public class TestMethon3 {

	/**
	 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
	 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
                 在主类的main ()方法中分别用参数区别调用三个方法。
    * @param args
    */
	
	public static void main(String[] args) {
		TestMethon3  t = new TestMethon3();
//		System.out.println(t.mOL(3));
//		System.out.println(t.mOL("wallace"));
//		System.out.println(t.mOL(4, 5));
		
		System.out.println(t.max(2, 3, 6));
		
	}
	//一个int参数
	public int mOL(int i) {
		return i*i;
	}
	//两个int参数
	public int mOL(int i,int j) {
			
			return i*j;
	}
	//一个字符串参数
	public String mOL(String name) {
		return name;
	}
	
	
	
	public int max(int x,int y) {
		int s;
		if(x>y) {
			s=x;
		}else {s=y;}
		
		return s;
	}
	public double max(double x ,double y) {
		double s;
		if(x>y) {
			s=x;
		}else {s=y;}
		
		return s;
	}
	public double max(double x ,double y,double z) {
		double s=(x>y)?(x>z?x:z):(y>z?y:z);
		return s;
	}
	
	public int m(int i,int j) {
		
		return 8;
	}
}
