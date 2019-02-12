package oop1204;

import java.util.Vector;

class Product {
	public int price;
	public int bonusPoint;
	public Product() {} // �⺻������
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (price*0.1); // ��ǰ�� 10%
	}
} // class e

class SmartTV extends Product {

	public SmartTV() {
		super(100); // price = 100, bonusPoint = 10
	}
	@Override
	public String toString() {
		return "SmartTV";
	}
	
} //class e
class Notebook extends Product {

	public Notebook() {
		super(200);
	}
	@Override
	public String toString() {
		return "��Ʈ��";
	}
	
} //class e
class Handphone extends Product {

	public Handphone() {
		super(150);
	}
	@Override
	public String toString() {
		return "�ڵ���";
	}
} //�ѤѤѤѤѤѤѤѤѤ� class e �ѤѤѤѤѤѤѤѤѤѤѤ�
class Buyer { //������
	private int money = 1000;
	private int mileage = 0; 
	public Buyer() {}
	
	//������ ��ǰ ����
	private Vector<Product> vec  = new Vector<>();
/*	
	public void buy(SmartTV a) {}
	public void buy(Notebook a) {}
	public void buy(Handphone a) {}
*/
	public void buy(Product p) { 
		if(this.money<p.price) {
			System.out.println("�ܾ׺���!");
			return;
		}
		vec.add(p);
		this.money = this.money - p.price;
		this.mileage = this.mileage + p.bonusPoint;
	}// buy e
	public void summary () {
		String list = ""; //���� ��ǰ���
		int hap = 0;	  //���� ��ǰ ���� ��
		if(vec.isEmpty()) {
			System.out.println("���� ��ǰ ����");
			return;
		}
		for(int idx=0; idx<vec.size(); idx++) {
			Product item = vec.get(idx);
			list =  list + item.toString() + "\r";
			hap = hap + item.price;
		}
		System.out.println("���Ÿ��" +"\r" + list);
		System.out.println("���ݾ� : " + hap);
		System.out.println("���� ��� : " + this.money);
		System.out.println("���ϸ��� : " + this.mileage);
	}// summary e
	public void refund(Product p) {
		if(vec.remove(p)) {
			System.out.println(p.toString() + " ��ǰ");
			this.money = this.money + p.price;
			this.mileage = this.mileage - p.bonusPoint;
			System.out.println("----------------");
		}else {
			System.out.println("������ ��ǰ�� �����ϴ�.");
		}
	}//refund e
}//class e
public class BuyerTest {

	public static void main(String[] args) {
		// ��ǰ ����, ��ǰ
		
		SmartTV tv = new SmartTV();
		Notebook note = new Notebook();
		Handphone phone = new Handphone();
		
		//����
		Buyer kim = new Buyer();
		kim.buy(tv);
		kim.buy(note);
		kim.buy(phone);
		
		//���
		kim.summary();
		
		System.out.println("------��ǰ------");
		//��ǰ
		kim.refund(note);
		
		kim.summary();
		
	}// main e
}// class e
