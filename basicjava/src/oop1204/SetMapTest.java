package oop1204;

import java.util.*;

public class SetMapTest {

	public static void main(String[] args) {
		//Set
/*		
  		Set set = new HashSet<>();
		set.add(3);
		set.add(4.5);
		set.add("Happy");
		set.add(new Integer(7));
		System.out.println(set.size()); // ��� ���� 4
*/				
		//Map : Key(�̸�), Value(��)
/*		HashMap map = new HashMap();
		map.put("one", 10);
		map.put("two", 3.5);
		map.put("three", "SOLDESK");
		//map.put("one", 200); //key�� �ߺ����� ���� �ʴ´�
		map.put("four", 10);
		System.out.println(map.get("one"));
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		System.out.println(map.get("four"));
		System.out.println(map.size());
*/
		//interface iterator : ����� ������ ��� ��������
/*		Set set = new HashSet();
		set.add(3);
		set.add(4.5);
		set.add("Happy");
		set.add(new Integer(7));
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj.toString());
		}//while e
*/
		HashSet<String> set = new HashSet<>();
		set.add("list.do=net.bbs.List");
		set.add("read.do=net.bbs.Read");
		set.add("write.do=net.bbs.Write");
		
		//�� = �� �������� ���ڿ� �и��ؼ� map ����
		//	   key : = ���� ���ڿ�
		//	   value : = ���� ���ڿ�
		HashMap map = new HashMap<>();
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			String str = (String)obj;
			System.out.println(str);
			int pos = str.indexOf("=");
			String key = str.substring(0, pos);
			String value = str.substring(pos+1);
			map.put(key, value);
		}//while e
		
		System.out.println(map.get("list.do"));
		System.out.println(map.get("read.do"));
		System.out.println(map.get("write.do"));//net.bbs.Read
		
	
	}//main e	
}// class e
