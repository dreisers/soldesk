package oop1130;

interface ICalc { //산술연산자 + - * / %
	public int add();
	public int sub();
	public int mul();
	public int div();
	public int mod();
}//interface e

class Calc implements ICalc { //구현
	private int x, y;

	public Calc() {}
	public Calc(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int add() {
		return this.x + this.y;
	}
	@Override
	public int sub() {
		return this.x - this.y;
	}
	@Override
	public int mul() {
		return this.x * this.y;
	}
	@Override
	public int div() {
		return this.x / this.y;
	}
	@Override
	public int mod() {
		return this.x % this.y;
	}
	
	
	
}//class e

public class InterfaceTest2 {

	public static void main(String[] args) {
		//인터페이스
		//개발 프로젝트에서 발생하는 여러 페이지들을
		//표준화, 구조화할 수 있다.
		
		//다형성
		ICalc calc = new Calc(5, 3);
		System.out.println(calc.add());
		System.out.println(calc.sub());
		System.out.println(calc.mul());
		System.out.println(calc.div());
		System.out.println(calc.mod());
		
				
		
		
		
	}//main e
}//class e
