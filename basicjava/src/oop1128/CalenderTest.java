package oop1128;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		// ��¥ ���� Ŭ����
		
		//���� �ý����� ��¥����
		Calendar cal = Calendar.getInstance();
		//����⵵
		System.out.println(cal.get(1));//year
		System.out.println(cal.get(2)+1);//month
		System.out.println(cal.get(5));//day
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		//����(�Ͽ�ȭ�������) -1234567
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));//4
		//�ð� (24�ð�����)
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
	}//main e
}// class end
