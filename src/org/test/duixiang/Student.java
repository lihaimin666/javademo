package org.test.duixiang;
/**
 * 编写一个Student类，包含name、gender、age、id、score属性，分别为String、String、int、int、double类型。
类中声明一个say方法，返回String类型，方法返回信息中包含所有属性值。
在另一个TestStudent类中的main方法中，创建Student对象，并访问say方法和所有属性，并将调用结果打印输出。

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
