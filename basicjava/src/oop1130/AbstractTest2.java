package oop1130;

abstract class Travel { //�߻�Ŭ����
	public void line() {}
	abstract public String travelWhere(); //�߻�޼ҵ�
}//class e
class Atype extends Travel {

	@Override
	public String travelWhere() {
		return "���ֵ� �÷���";
	}
	
}//class e
class Btype extends Travel {

	@Override
	public String travelWhere() {
		return "���ǵ� �Ҳ�����";
	}
	
}//class e
class Ctype extends Travel {

	@Override
	public String travelWhere() {
		return "���� ������";
	}
	
}//class e
public class AbstractTest2 {

	public static void main(String[] args) {
		
		
		// �߻�Ŭ������ ��ü ���� �Ұ���
		// Travel tour = new Travel(); ����
		
		//�߻�Ŭ���������� ������
		Travel tour = new Atype();
		System.out.println(tour.travelWhere());
		
		tour = new Btype();
		System.out.println(tour.travelWhere());
		
		tour = new Ctype();
		System.out.println(tour.travelWhere());
		
	}//main e
}// class e
