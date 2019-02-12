package oop1128;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

class Jumin {
	private String jumin;
	public Jumin() {}
	public Jumin(String jumin) {
		this.jumin = jumin;
	}
	
	//�ֹι�ȣ�� ������ flag = true
	public boolean validate() {
		boolean flag = false;
	
		Integer[] sum = new Integer[]
								{ 2, 3, 4, 5, 6, 7,
								  8, 9, 2, 3, 4, 5 };
		Integer[] save = new Integer[12];
		int size = save.length;
		int hap = 0;
		for(int idx=0; idx<size; idx++) {
		int num = Integer.parseInt(jumin.substring(idx, idx+1)); 
		save[idx] = num * sum[idx];
		hap = hap + save[idx];
		}//for e
		int m = (11-(hap%11))%10;
		if(m==Integer.parseInt(jumin.substring(12))) {
			flag = true;
		}
		return flag;
	}
	
public void disp() {
	//�¾ ��, ��, �� ��������
	int myyear = Integer.parseInt(this.jumin.substring(0, 2));
	int mymonth = Integer.parseInt(this.jumin.substring(2, 4));
	int mydate = Integer.parseInt(this.jumin.substring(4, 6));
	
	
	//�����ڵ�
	int code = Integer.parseInt(this.jumin.substring(6,7));
	switch(code) {
	case 1:
	case 2: myyear = myyear + 1900; break;
	case 3:
	case 4: myyear = myyear + 2000; break;
	}
	//1)����
	 String gender = "";
     switch(code%2) {
     case 0 : gender = "����"; break;
     case 1 : gender = "����"; break;
     }
	//2)���� 
	Calendar today = Calendar.getInstance();
	int age =  today.get(Calendar.YEAR) - myyear;
					
		
		//3)�� %12 -> 0 =������
		String[] B = {"������", "��", "��", "����", "��", "��",
						   "ȣ����", "�䳢", "��", "��", "��", "��" };
		String gan = B[myyear%12]; //�迭�ȿ� ���� ����!
		
		//���
		System.out.println("�ֹι�ȣ : " + this.jumin);
		System.out.println("�¾ �⵵ : " + myyear);
		System.out.println("�¾ �� : " + mymonth);
		System.out.println("�¾ �� : " + mydate);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("�� : " + gan);
		
		
		//4)��ƿ� �ϼ� 2018 11 28 - 1994 01 11 = ?
		Calendar myBirth = Calendar.getInstance();
		myBirth.set(Calendar.YEAR, myyear);
		myBirth.set(Calendar.MONTH, mymonth-1);
		myBirth.set(Calendar.DATE, mydate);
		
		int alive = 1;
		while(!myBirth.after(today)) {
			alive++;
			System.out.print(myBirth.get(1));
			System.out.print(myBirth.get(2));
			System.out.print(myBirth.get(5));
			System.out.println();
			myBirth.add(Calendar.DATE, 1);
		}
		System.out.println("��ƿ� �� �� : " + alive);
		//����⵵ 5���� ���Ͻÿ�
		//cal.add(Calendar.YEAR, 5); 2023
		//3������ ���ÿ�
		//cal.add(Calendar.MONTH, -3); 2023-7-28
		//cal.add(Calendar.DATE, 1); 2023-7-29
		
		//��¥������ �����ϱ�

/*		cal.set(1989, 5, 30);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.NOVEMBER);
		cal.set(Calendar.DATE, 28);
		
	
		GregorianCalendar cal1 = new GregorianCalendar();
		if(cal1.isLeapYear(2018)) {
			System.out.println("����");
		}else {
			System.out.println("���");
		}
		
		GregorianCalendar cal2 = new GregorianCalendar(1989, 5, 3);
		System.out.println(cal2.get(Calendar.YEAR));
		System.out.println(cal2.get(Calendar.MONTH));
		System.out.println(cal2.get(Calendar.DATE));*/
}
}//class e
public class JuminTest {

	public static void main(String[] args) {
			// �ֹι�ȣ�� ��ȣ���� �����ϴ� ���α׷�
			// ����, ����, ��, ��ƿ� �ϼ�
		Jumin id = new Jumin("9401111187911");
		if(id.validate()) {
			System.out.println("�ֹι�ȣ ����");
			id.disp();
		}else {
			System.out.println("�ֹι�ȣ ����");
		}
			
		
	}//main e
}//class e
