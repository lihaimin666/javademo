package org.test.duixiang;
/**
 * ��дһ��Student�࣬����name��gender��age��id��score���ԣ��ֱ�ΪString��String��int��int��double���͡�
��������һ��say����������String���ͣ�����������Ϣ�а�����������ֵ��
����һ��TestStudent���е�main�����У�����Student���󣬲�����say�������������ԣ��������ý����ӡ�����

 * @author Administrator
 *
 */
public class Student {

	
	String name;
	String gender;
	int age ;
	int id;
	double score;
	
	public String say() {
		return " name= "+name +" gender = "+gender+"\n age = "+age+" id= "+id+" score = "+score;
	}
	
	
}
