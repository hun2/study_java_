package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		int water =  900;
		System.out.println("���� ������ " + water +"��" + " �Դϴ�.");
		
		int threewater = water * 3;
		System.out.println("���� ������ " + water +"��" + " �Դϴ�." + "���� ���� ������" + threewater + "��" + "�Դϴ�.");
		
		int money = 10000;
		int change = money - threewater;
		System.out.println("�Ž����� :" + change);
		
		
		money = 5000;
		change = money/water;
		int ee = money % water;
		System.out.println("�� �� �ִ� ���� " + change + " ��" + "�Դϴ�." );
		System.out.println("���� ���� " + ee + "��" + " �Դϴ�.");
		
		
		
		
		// 		���� ������ 90�� �̻��̸� 'A'�����̰� ������ 4.0 �Դϴ�.
		 // ���� ������ 80�� �̻��̸� 'B'�����̰� ������ 3.0 �Դϴ�.
	}

}
