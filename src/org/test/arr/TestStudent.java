package org.test.arr;

/**
 * ����20��ѧ������ѧ��Ϊ1��20���꼶�ͳɼ����������ȷ����
 * ��ӡ��3�꼶(stateֵΪ3����ѧ����Ϣ
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
				
				System.out.println(" ѧ�� :"+stu[i].getNumber()+" �꼶 :"+stu[i].getState()+"  �ɼ�:"+stu[i].getScore());
			}
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < stu.length; i++) {
			System.out.println(" ѧ�� :"+stu[i].getNumber()+" �꼶 :"+stu[i].getState()+"  �ɼ�:"+stu[i].getScore());
		}
//		System.out.println(Math.round((Math.random())*3)+1);
//		System.out.println(Math.round((Math.random())*100)-1);
		
	}

}
