package variable_quiz;

public class Quiz_02 {

	public static void main(String[] args) {
		  // ���� ������ 90�� �̻��̸� 'A'�����̰� ������ 4.0 �Դϴ�.
		  // ���� ������ 80�� �̻��̸� 'B'�����̰� ������ 3.0 �Դϴ�.
		
		int grade = 95;
		
		
		if ( grade >= 80) {
			System.out.println("B�����̰� ������ 3.0 �Դϴ�.");
			
			
		}
		
		else if (grade >= 90) {
			System.out.println("A�����̰� ������ 4.0 �Դϴ�.");
			
		}
		
		int a = 90;
		char aaa= 'A';
		double aa = 4.0;
		
		int b = 80;
		char bbb = 'b';
		double bb = 3.0;
		
		System.out.println("���輺���� " + a + "�̻��̸� '" + aaa + "'�����̰�" + "������" + aa + "�Դϴ�.");
		System.out.println("���輺���� " + b + "�̻��̸� '" + bbb + "'�����̰�" + "������" + bb + "�Դϴ�.");
		
		
		//�Ʒ� ������ �Ǽ��� ���ؼ� ����ϼ���
		int number1 = 33;
		double number2 = 35.325;
		double sum = number1*number2;
		
		System.out.println( " �μ��� ���� : " + sum  );
		
		//943 �ð��� ���� ��ð� ���� ���Ͽ� ����ϼ���.
		
		int number3 = 943;
		int app = number3 / 24;
		int appp = number3%24;
		System.out.println(number3 + "�ð��� " + app + "�� " + appp + "�ð� �Դϴ�."	);
		
		
		//���� ���� ���ϱ� ���� ���� 8, ���� ���� 9�� �簢���� �ﰢ���� ���̸� ���� ���Ͽ� ����ϼ���.
		int z = 8;
		int p = 9;
		int zp = z*p;
		
		
		System.out.println("�簢���� ���� : " + zp);
		System.out.println("�ﰢ���� ���� : " + zp/2);
		
		
		
		
	}

}
