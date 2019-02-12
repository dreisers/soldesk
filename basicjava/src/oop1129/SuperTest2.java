package oop1129;

class Parent {
	int one;
	int two;
	
	public Parent() {}
	public Parent(int one, int two) {
		this.one = one;
		this.two = two;
	}
}//class e
class Child extends Parent {
	int three;
	public Child() {
	}
	public Child(int a, int b, int c) {
		super(a, b);
		this.three = c;
	}
}//class e
public class SuperTest2 {
	public static void main(String[] args) {
		//super 
		//super()
		Child child = new Child(10, 20, 30);
		System.out.println(child.three);
		System.out.println(child.one);
		System.out.println(child.two);
		
	}//main e
}// class e
