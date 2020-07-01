package org.test.arr;

public class TestArr3 {
    public  int age;
    int aa;
    protected String name;
    private  String str;
    TestArr3(){
    	this.age =3;
    	this.getAge();
    	this.addAge(age);
    	
    }
    TestArr3(int age){
    	this.age=age;
    }
    
	public static void main(String[] args) {
		int[] arr = new int[20];
		TestArr3 t = new TestArr3();
		t.isArray(arr);
		t.age=3;
		System.out.println(t.addAge(t.age));
		System.out.println(t.getAge());
			
		
	}
	
	public int getAge() {
		return age;
	}
	
	public int addAge(int age) {
		return this.age=age+1;
	}

	public  void isArray(int[] arr) {

		for (int i = 0; i < 20; i++) {
			if(i==0) {
				arr[i] = arr[i] + 2;
			}else {
				arr[i]= arr[i-1]+2;
			}
			System.out.println(arr[i]);
		}
		int j=0;
		while(j<20) {
			
			if(j==0) {
				arr[j] = arr[j] + 2;
			}else {
				arr[j]= arr[j-1]+2;
			}
			System.out.println(arr[j]);
			
			
			j++;
		}
	}

}
