package oop1203;

import java.util.ArrayList;
import java.util.Vector;

class Mountain {
	String name; 
	int height;
	public Mountain() {}
	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
}//class e

public class GenericTest {

	public static void main(String[] args) {
		//GenericTest 제네릭스
		//E Element 요소 : 참조형
		//K Hey
		//V Value
/*		
		Vector<String> vec = new Vector<>();
			vec.add("one");
			vec.add("two");
			vec.add("three");
		//vec.add(3);
		//vec.add(5.6);
		//vec.add(new Integer(9));
			vec.add(new String("five"));
		
			ArrayList<Integer> list = new ArrayList<>();
			list.add(5);
			list.add(7);
			list.add(new double(4.2));
			list.addAll("seven");
*/					
	Mountain one = new Mountain("관악산",900);
	Mountain two = new Mountain("치악산",1200);
	Mountain three = new Mountain("설악산",1300);
	
	ArrayList<Mountain> list = new ArrayList<>();
	list.add(one);
	list.add(two);
	list.add(three);
//	list.add("SOLDESK");
	
	for(int idx=0; idx<list.size(); idx++) {
		Mountain vo = list.get(idx);
		System.out.print(vo.name + " " + vo.height);
		System.out.println();
	}
		
	}//main e
}//class e
