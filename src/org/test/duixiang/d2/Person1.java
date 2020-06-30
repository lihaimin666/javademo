package org.test.duixiang.d2;

public class Person1 {
	private String name ;		
	private int age ;
	private boolean sex;
	
	public Person1(String name){
//		this();      // 调用本类中的无参构造方法
		this.name = name ;
		this.age =1;
	}
	public Person1(String name,int age){	
//		this(name) ;  // 调用有一个参数的构造方法
		this.age = age;
	}
	public Person1(String name ,int age ,boolean sex) {
//		this(name,age);
//		this();
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	public Person1(){	  // 无参构造
        
		System.out.println("新对象实例化") ;
	}
	public String getInfo(){	
		return "姓名：" + name + "，年龄：" + age ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}  
}
