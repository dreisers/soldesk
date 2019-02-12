package oop1130;

class Print {
	//method overloding : �Ű������� �ڷ���, ����
	//static : Ŭ���������� ���� ���� ����, ���� continue
	/*
	public static void view(Integer a) {
		System.out.println(a.toString());
	}
	public static void view(Double a) {
		System.out.println(a.toString());
	}
	public static void view(String a) {
		System.out.println(a.toString());
	}
*/
	public static void view(Object obj) {
		System.out.println(obj.toString());
	}
	public static Integer disp() {
		return new Integer(7);
	}
	public static Double disp2() {
		return 3.4;	//autoboxing �ڵ����� ���������� ��ȯ
	}
	public static Object disp3() { // ������
		return new Integer(9);
	}
	public static Object disp4() {
		return new Double(8.7);
		}
	public static Object disp5() {
		return "SOLEDESK"; //autoboxing 
		}
}//class e
public class ObjectTest {

	public static void main(String[] args) {
			/* Object Ŭ����
			 	�ڹ�Ŭ���� �ְ� ���� : Object
			 	�ڹ��� ��� Ŭ������ ObjectŬ������ �ļ��̴�.
			 	�ڹ��� ��� Ŭ������ ObjectŬ������ ���԰����ϴ�
			 	������ 
			 */
/*		
			Integer inte = new Integer(3);
			System.out.println(inte);
			System.out.println(inte.toString());
			
			String str = new String("Happy");
			System.out.println(str);
			System.out.println(str.toString());
			
			Object object = new Integer(5);
			System.out.println(object.toString());
			System.out.println(object);
			
			object = new String("Apple");
			System.out.println(object.toString());
			System.out.println(object);
			
			int a = (int)3.4;
			String name = (String)object;
			System.out.println(name.toString());
			System.out.println(name);
*/			
		//1) �޼ҵ�� ������ Object Ŭ����
/*			
			Print.view(3); 			 // autoboxing 
			Print.view(3.4);			// �⺻���� ���޵Ǹ� 
			Print.view("Happy"); // �ڵ����� �������� �ȴ�.
		
			Print.view(new Integer(6));
			Print.view(new Double(7.8));
			Print.view(new String("Apple"));
*/			
		//2) �޼ҵ��� �������� Object Ŭ����
		Object obj = Print.disp3();
		System.out.println(obj.toString()); 
		System.out.println(obj); 
		Print.disp3();
		Integer inte = (Integer) Print.disp3();
		
		Double dou = (Double) Print.disp4();
		
		String str = (String) Print.disp5();
		
		System.out.println(inte.toString());
		System.out.println(dou.toString());
		System.out.println(str.toString());
		
	}//main e
}// class e
