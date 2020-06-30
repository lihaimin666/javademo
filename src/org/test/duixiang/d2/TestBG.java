package org.test.duixiang.d2;

public class TestBG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl g = new Girl();
		Boy  b = new Boy();
		g.setName("sally");
		b.setName("blus");
		b.setAge(25);
		
//		g.marry(b);
		
		b.marry(g);
		b.shout(g);
	}

}
