package variable_quiz;

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		
		
		//1�� 
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("�Է� 1:");
//		int x = scan.nextInt();
//		
//		System.out.print("�Է� 2:");
//		int b = scan.nextInt();
//		
//		
//		int sum = x/b;
//		int result = x%b;	
//		System.out.println("�� :" + sum + " ������ :" +  result );
	
		
		// 2�� ��ü �˰���
//		System.out.print("x :");
//		Scanner scan = new Scanner(System.in);
//		int x = scan.nextInt();
//		System.out.print("y :");
//		int y = scan.nextInt();
//		
//		
//		System.out.println("X�� "+ y + "�̰�"+ "Y��"+ x + "�̴�.");
//		 int temp = x;
//		 x = y;
//		 y = temp;                   //  > �� �ٲٴ� ���İ��� ��.
//		System.out.println("X�� " + x + "�̰�" + "Y��" + y + "�̴�");
//		// x�� ���� y�� ���� �ȹٲٰ� ���� �ְ� �ʹٸ� �ӽ� temp ������ x ���� >  �׸��� y�� x�� > �ٽ� temp�� �ٽ� y
		
		//3��
//		System.out.print("�� : ");
//		Scanner scan = new Scanner(System.in);
//		int x = scan.nextInt();
//		
//		int b = x / 60;
//		int c = x%60;
//		System.out.println(b  + "�� " + c+ "��");
//		
		
		
		//4�� 
//		System.out.print("�Է� : ");
//		Scanner scan = new Scanner(System.in);
//		int x = scan.nextInt();
//		
//
//		System.out.println(Math.round(x)/1000);
//		System.out.println(Math.round(x/100)%10);
//		System.out.println(Math.round(x/10)%10);
//		System.out.println(Math.round(x/1)%10);
		
		
		
		//5��
		
		System.out.print("�Է� : ");
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt() ;
		int y = 0;		
		
				
		while ( x != 0) {
			y += x%10;
			x /= 10;
		}
		
		System.out.println("�� �ڸ����� ���� " + y + "�̴�");
		
		
	}

}
