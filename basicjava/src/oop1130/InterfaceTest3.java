package oop1130;

class Unit {
	int currentHp; // 유닛의 체력
	int x, y; 		   // 유닛의 x좌표, y좌표
}//class e

interface Movable {
	void move(int x, int y);
}//intertface e
interface Attackalbe{
	void attack(Unit u);
}//interface e
//인터페이스는 다중상속이 가능하다
interface Fightable extends Movable, Attackalbe {
}//interface e
class Fight extends Unit implements Fightable {

	@Override
		public void attack(Unit u) {
		
	}

	@Override
		public void move(int x, int y) {
		
	}
	
}//class e
public class InterfaceTest3 {

	public static void main(String[] args) {
		//인터페이스간의 상속
		
		
		
		
	}//main e
}//class e
