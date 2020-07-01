package org.test.arr;

public class Student {
	//学号number(int)，年级state(int)，成绩score(int)
	
	private int number;//学号
	private int state; //年级
	private int score;
	
	
	Student(){}
	Student(int number,int state,int score){
	       this.number=number;
	       this.state =state;
	       this.score =score;
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
