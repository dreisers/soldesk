package oop1203;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		// Java Collection Framework
		// �迭 Array
		/* 
		   List	: ������ �ִ�. �ε����� �ִ�(0����~)
		   			  List, Vector, ArrayList, Collections
		   Set		: ������ ����. Set. HashSet, Iterator
		   Map	: ������ ����. Map. HashMap, HashTable
		 */
/*		int[] su = new int[3]; 
		List list = new Vector();
		
		Vector vec = new Vector();
		vec.add(3);
		vec.add(5.6);
		vec.add("HAPPY");
		vec.add(new Integer(7));
		vec.add(new Character('R'));
		vec.add(new String("APPLE"));
		
		System.out.println(vec.get(2));
		Object obj=vec.get(5);
		String str = (String) obj;
		System.out.println(str.toString());
		System.out.println(str);
		
		System.out.println(vec.size());
		for(int idx=0; idx<vec.size(); idx++) {
			System.out.println(vec.get(idx));
		}
		vec.remove(3);
		for(int idx=0; idx<vec.size(); idx++) {
			System.out.println(vec.get(idx));
		}
		//��� ���λ���
		
		vec.removeAllElements();
		System.out.println(vec.size());
		System.out.println(vec.isEmpty());
		if(vec.isEmpty()) {
			System.out.println("����ִ�");
		}else {
			System.out.println("��� ���� �ʴ�");
		}
		
		for(int idx=vec.size()-1; idx>=0; idx--) {
			System.out.println(vec.remove(idx));
		}
		System.out.println(vec.size());
*/		
	
		List list = new ArrayList();
		list.add(5);
		list.add(3.4);
		list.add('R');
		list.add("SOLDESK");
		list.add(new Integer(7));
		
		for(int idx=0; idx<list.size(); idx++) {
			System.out.println(list.get(idx));
		}
		System.out.println(list.isEmpty());
		
		
	}//main e
}//class e
