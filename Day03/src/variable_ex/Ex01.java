package variable_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//�Է��ϱ�
		// ctrl + shift + o ����Ʈ ��� ������.
		
		
		System.out.println("���� ������ �Է��ϼ¿�");
		Scanner scan = new Scanner(System.in);
			
		int water = scan.nextInt();
		
		System.out.println(water);
		System.out.println("���� ������" + water + "�Դϴ�.");
		
		System.out.println("���� ������ �Է��ϼ���");
		scan.nextInt();
		int count = scan.nextInt();
		int result = water * count;
		
		System.out.println("����" + count + "���� ������" + result +"�� �Դϴ�");
		
		scan.close();	
		
		
		
		
		
	}

}
