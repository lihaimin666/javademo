package org.test.duixiang.d2;

public class Person1 {
	private String name ;		
	private int age ;
	private boolean sex;
	
	public Person1(String name){
//		this();      // ���ñ����е��޲ι��췽��
		this.name = name ;
		this.age =1;
	}
	public Person1(String name,int age){	
//		this(name) ;  // ������һ�������Ĺ��췽��
		this.age = age;
	}
	public Person1(String name ,int age ,boolean sex) {
//		this(name,age);
//		this();
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	public Person1(){	  // �޲ι���
        
		System.out.println("�¶���ʵ����") ;
	}
	public String getInfo(){	
		return "������" + name + "�����䣺" + age ;
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
