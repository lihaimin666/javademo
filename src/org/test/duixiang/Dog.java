package org.test.duixiang;
/**
 * 编写一个Dog类，包含name、age、weight属性
类中声明一个say方法，返回String类型，方法返回信息中包含所有属性值。
 在另一个TestDog类中的main方法中，创建Dog对象，并访问say方法和所有属性，将调用结果打印输出。
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
