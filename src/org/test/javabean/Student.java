package org.test.javabean;

import java.util.List;

public class Student {

	
	private int studentNo;
	private String name;
	private char sex;
	private String hometown;
	private int  age;
	private String classic;
	private String  card;
	
	public int add() {
		
//		jdbc
		return 0;
	}
	
    public int del() {
		
//		jdbc
		return 0;
	}
    
    public int update() {
		
//		jdbc
		return 0;
	}
    
//    public List<Student> list() {
//		
////		jdbc
//		return 0;
//	}
	
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassic() {
		return classic;
	}
	public void setClassic(String classic) {
		this.classic = classic;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	
	
	
}
