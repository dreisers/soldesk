package oop1116;

public class QuizTest {
	public static void main(String[] args) {
		// ����) ����Ÿ��� ���� �ý� ����� ����ϴ� ���α׷�
	    // 2000m������ �⺻��� 900���̰�
	    // 2000m�ʰ� ����� 200m��������
	    // �⺻��ݿ� 100���� �����Ͽ� ����� ����Ѵ�
	    
	    /* ��°��
	       ����Ÿ� : 3000
	       ��� : ?
	    */
		int distance = 3000;
		int fee = 0;
		if(distance<=2000) {
			fee = 900;
		}else {
			int over = distance-2000;
			fee = 900 + ((over/200) * 100);
		}
		System.out.println("����Ÿ� : " + distance);
		System.out.println("�⺻��� : 900" );
		System.out.println("��ü��� : " + fee);
	  }//main() end
	}//class end
