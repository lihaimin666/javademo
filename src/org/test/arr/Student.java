package org.test.arr;

public class Student {
	//ѧ��number(int)���꼶state(int)���ɼ�score(int)
	
	private int number;//ѧ��
	private int state; //�꼶
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
