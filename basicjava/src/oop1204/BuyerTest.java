package oop1204;

import java.util.Vector;

class Product {
	public int price;
	public int bonusPoint;
	public Product() {} // 기본생성자
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (price*0.1); // 상품의 10%
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
		return "노트북";
	}
	
} //class e
class Handphone extends Product {

	public Handphone() {
		super(150);
	}
	@Override
	public String toString() {
		return "핸드폰";
	}
} //ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ class e ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
class Buyer { //구매자
	private int money = 1000;
	private int mileage = 0; 
	public Buyer() {}
	
	//구매한 상품 저장
	private Vector<Product> vec  = new Vector<>();
/*	
	public void buy(SmartTV a) {}
	public void buy(Notebook a) {}
	public void buy(Handphone a) {}
*/
	public void buy(Product p) { 
		if(this.money<p.price) {
			System.out.println("잔액부족!");
			return;
		}
		vec.add(p);
		this.money = this.money - p.price;
		this.mileage = this.mileage + p.bonusPoint;
	}// buy e
	public void summary () {
		String list = ""; //구매 상품목록
		int hap = 0;	  //구매 상품 가격 합
		if(vec.isEmpty()) {
			System.out.println("구매 상품 없음");
			return;
		}
		for(int idx=0; idx<vec.size(); idx++) {
			Product item = vec.get(idx);
			list =  list + item.toString() + "\r";
			hap = hap + item.price;
		}
		System.out.println("구매목록" +"\r" + list);
		System.out.println("사용금액 : " + hap);
		System.out.println("남은 재산 : " + this.money);
		System.out.println("마일리지 : " + this.mileage);
	}// summary e
	public void refund(Product p) {
		if(vec.remove(p)) {
			System.out.println(p.toString() + " 반품");
			this.money = this.money + p.price;
			this.mileage = this.mileage - p.bonusPoint;
			System.out.println("----------------");
		}else {
			System.out.println("구매한 상품이 없습니다.");
		}
	}//refund e
}//class e
public class BuyerTest {

	public static void main(String[] args) {
		// 상품 구매, 반품
		
		SmartTV tv = new SmartTV();
		Notebook note = new Notebook();
		Handphone phone = new Handphone();
		
		//구매
		Buyer kim = new Buyer();
		kim.buy(tv);
		kim.buy(note);
		kim.buy(phone);
		
		//출력
		kim.summary();
		
		System.out.println("------반품------");
		//반품
		kim.refund(note);
		
		kim.summary();
		
	}// main e
}// class e
