package org.test.duixiang;
/**
 * ��дһ��Dog�࣬����name��age��weight����
��������һ��say����������String���ͣ�����������Ϣ�а�����������ֵ��
 ����һ��TestDog���е�main�����У�����Dog���󣬲�����say�������������ԣ������ý����ӡ�����
 */
public class Dog {
	private String name="wangwang";
	private int age =1;
	private int weight=10;
	
	public String say() {
		int c =10;
		return " name = "+name+"  age= "+age+"  weight ="+weight;
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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
