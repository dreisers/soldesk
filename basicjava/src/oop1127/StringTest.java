package oop1127;

public class StringTest {

	public static void main(String[] args) {
		// String Ŭ����
		String name = "ȫ�浿";
		String str = new String("Gone With The Wind");
/*		
		//���ڰ���
		System.out.println(str.length()); //18
		//���ڼ��� (0���� ����)
		System.out.println(str.indexOf("d"));//17
		//ó������ ������ ������ �ε����� ��ȯ
		System.out.println(str.indexOf("W"));//5
		//ã���� �ϴ� ���ڿ��� ���� ���
		System.out.println(str.indexOf("R"));//-1
		//0��° ����
		System.out.println(str.charAt(0));//'G'
		//������ ����
		System.out.println(str.charAt(17));//'d'
		System.out.println(str.charAt(str.length()-1));//'d' 
		
		//���ڿ�?
		System.out.println(str.isEmpty()); 
		
		//�빮��, �ҹ��ڷ�
		System.out.println(str.toUpperCase()); //GONE WITH THE WIND
		System.out.println(str.toLowerCase()); //gone with the wind
		
		//���ڿ� ġȯ(�ٲٱ�)
		System.out.println(str.replace('n', 'N'));// GoNe With the WiNd
		
		
		//���� -> <br>�� ġȯ
//		System.out.println(str.replace('\n', '<br>'));

		//Ư�� ���ڸ� �������� ���ڿ� �и�
		String word[] = str.split("e");
		for(int idx=0; idx<word.length; idx++) {
			System.out.println("#" + word[idx] + "#");
		}//for e
		// .csv -> Ư����ȣ�� �����͸� �����ؼ� ����
		
		//���ڿ� �ڸ���
		//3��°���ں���~����������
		System.out.println(str.substring(3));
		//3��° ~ (8-1)����
		System.out.println(str.substring(3, 8));
		//(������ġ, ����ġ+1)
		
		//��)
		System.out.println(str.substring(0, 1));
		
		//��)
		System.out.println(str.substring(17, 18));
		System.out.println(str.substring(str.length()-1, str.length()));
		
		//�� �յ� ��������
		System.out.println("#" + "    S k   y  ".trim() + "#");
*/		
		//��) �̸��� @���ڸ� �������� ���ڿ� �и�
		String email = "webmaster@soldesk.com";
			int mail = email.indexOf("@");
			String id = email.substring(0, email.indexOf("@"));
			String server = email.substring(email.indexOf("@")+1, email.length());
			System.out.println("���̵� : " + id);
			System.out.println("�ּ� : " + server);
/*			����� Ǯ�� ��
 
			if(email.indexOf("@")==-1) {
				System.out.println("�̸��� �ּ� Ʋ��!!");
			}else {
				System.out.println("�̸��� �ּ� ����");
				System.out.println(email.substring(0, 9));
				System.out.println(email.subSequence(10, 21));
			}
			// 
				int pos = email.indexOf("@");
				String i = email.substring(0, pos);
				String ser = email.substring(pos+1);
				System.out.println(i);
				System.out.println(ser);
			//
				String word[] = email.split("@");
				for(int idx=0; idx<word.length; idx++) {
					System.out.println(word[idx]);
				}
*/				
		//��) �ֹι�ȣ : ����, ����
//		���� : ���� 
//		���� : 29
//		8+9+1+2+3+0+1+2+3+4+5+6+7
		
		String jumin = "8912301234567";
		
		int hap = 0;
		for(int idx=0; idx<jumin.length(); idx++) {
/*
			char ch = jumin.charAt(idx);
			hap = hap + Character.getNumericValue(ch);
			//getNumericValue ĳ�������� ���������� ����ȯ
		}// for e
		System.out.println(hap);
*/		
//-------------------------------------------------2)
		
			String ch = jumin.substring(idx, idx+1);
			hap = hap + Integer.parseInt(ch);
			}
			System.out.println(hap);
			
			//�����ڵ�
			int code = Integer.parseInt(jumin.substring(6,7));
			//�¾ �⵵
			int myYear = Integer.parseInt(jumin.substring(0, 2));
			switch(code) {
			case 1:
			case 2: myYear = myYear + 1900; break;
			case 3:
			case 4: myYear = myYear + 2000; break;
			}
			//����
			int age = 2018 - myYear;
			//����
			String gender = "";
			switch(code%2) {
			case 0 : gender = "����"; break;
			case 1 : gender = "����"; break;
			}
			
			System.out.println("�ֹι�ȣ : " + jumin);
			System.out.println("���� : " + gender);
			System.out.println("���� : " + age);
	}//main e
}// class e
