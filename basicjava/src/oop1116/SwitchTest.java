package oop1116;

public class SwitchTest {

	public static void main(String[] args) {
//			switch~case��
//			break�� : ���ǹ��� ����������
//			case���� ����� �ݵ�� �������� �ʿ�� ����.
/*
			switch(��) {
				case ��1 : ó����1; break;
				case ��2 : ó����2; break;
				case ��3 : ó����3; break;
			}
		
		
	switch(20) {
	case 10 : System.out.println("SEOUL"); break;
	case 20 : System.out.println("JEJU"); break;
	case 30 : System.out.println("BUSAN"); break;}//switch end
	
	switch(20) {
	case 10 : System.out.println("SEOUL"); break;
	case 20 : System.out.println("JEJU"); 
	case 30 : System.out.println("BUSAN"); break;
	default : System.out.println("etc"); //������
	}
	
/*
//	��) ���� 90�̻� A
//			    80       B
//			    70       C
//			    60       D
//			    ������ F
		int kor = 85;
		switch(kor/10) {
		case 10 : System.out.println("���� : A");break;
		case 9 : System.out.println("���� : A");break;
		case 8 : System.out.println("���� : B");break;
		case 7 : System.out.println("���� : C");break;
		case 6 : System.out.println("���� : D");break;
		default  : System.out.println("���� : F");
		}

//		��)
		int a = 3, b=5;
		char op = '/';
		switch(op) {
		case '+' : System.out.println(a+b);break;
		case '-' : System.out.println(a-b);break;
		case '*' : System.out.println(a*b);break;
		case '/' : System.out.println((double)a/b);break;
		case '%' : System.out.println(a%b);break;}
*/
//		��) ����, ����
		int code = 3; 
		
		switch(code%2) {
		case 0 : System.out.println("����");break;
		case 1 : System.out.println("����");break;
		}
//		���� : �����ڵ尡 1, 2 �� 1900���
//		                         3, 4 �� 2000 ���� ���
		int myYear = 15;
		int age = 0;
		switch(code) {
		case 1 : myYear = myYear + 1900;break;
		case 2 : myYear = myYear + 1900;break;
		case 3 : myYear = myYear + 2000;break;
		case 4 :myYear = myYear + 2000;break;
		}
		age = 2018-myYear;
		System.out.println("���� : " + age);
		
	}//
}//
