package condition_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//�� ���� ���� �Է¹ް� ���ϱ�
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ���� ���� �Է��ϼ��� :");
		int number1= scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println(number1);
		System.out.println(number2);
		
		if ( number1 > number2 ) {
			System.out.println("��");
		}
		else {
			System.out.println("����");
		}
		
		
		
		
	}

}
