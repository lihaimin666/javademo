package org.test.arr;

/**
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定，
 * 打印出3年级(state值为3）的学生信息
 */
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] stu = new Student[20];
		
		for(int i=0;i<20;i++) {
			stu[i] =new Student();
			stu[i] = new Student(i+1,(int)(Math.round((Math.random())*3)+1),(int)(Math.round((Math.random())*100)-1));
			stu[i].setNumber(i+1);
			stu[i].setState((int)(Math.round((Math.random())*3)+1));
			stu[i].setScore((int)(Math.round((Math.random())*100)-1));
			
			if(stu[i].getState()==3) {
				
				System.out.println(" 学号 :"+stu[i].getNumber()+" 年级 :"+stu[i].getState()+"  成绩:"+stu[i].getScore());
			}
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < stu.length; i++) {
			System.out.println(" 学号 :"+stu[i].getNumber()+" 年级 :"+stu[i].getState()+"  成绩:"+stu[i].getScore());
		}
//		System.out.println(Math.round((Math.random())*3)+1);
//		System.out.println(Math.round((Math.random())*100)-1);
		
	}

}
