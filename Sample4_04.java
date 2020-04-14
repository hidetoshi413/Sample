package jp.winschool.java.chapter14;


class Parent2{

}

class Child2 extends Parent2{
	public void method() {
		 System.out.println("Child2.method()");
	}
}
public class Sample4_04 {

	public static void main(String[] args) {
	Parent2 p2 = new Child2();
	Child2 c2 = (Child2)p2;
	c2.method();
	






	}

}
