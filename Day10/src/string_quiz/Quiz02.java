package string_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		// id�� �Է¹ް� ����Ͻÿ�
		Scanner scan = new Scanner(System.in);
//		System.out.print("ID�� �Է� �ϼ��� : ");
//		String word = scan.next();
//		System.out.println("Welcome! " + word);
		
		
		
		
		//���ڿ� �˻� ���� �ܾ �Է� �ް� 'e' �� �� �� ��� �ִ��� ��� �ϼ���.
		System.out.print("�ܾ �Է��ϼ��� : " );
		String word2 = scan.next();

		
		//contains : Ư�� ���ڿ��� ���ڿ��� ���ԵǾ� �ִ��� Ȯ��
		int count = 0;
		
		for (int i =0; i< word2.length() ; i++)
		if ( word2.contains("e")) {
			count++;
		}
		else {
		}
		System.out.println("e�� ������ :" + count + "�� �Դϴ�.");
				
		
		
	}

}
