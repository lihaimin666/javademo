package org.test.duixiang.d3;

public class Student extends Person {
	
	int id;
	int score;
	
	Student(){
		
	}
	Student(int id,int score){
		this.id=id;
		this.score=score;
	}
	
	
	public String say() {
		return super.say()+"  "+id+" "+score;
	}
}
