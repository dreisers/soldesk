package oop1130;

class Unit {
	int currentHp; // ������ ü��
	int x, y; 		   // ������ x��ǥ, y��ǥ
}//class e

interface Movable {
	void move(int x, int y);
}//intertface e
interface Attackalbe{
	void attack(Unit u);
}//interface e
//�������̽��� ���߻���� �����ϴ�
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
		//�������̽����� ���
		
		
		
		
	}//main e
}//class e
