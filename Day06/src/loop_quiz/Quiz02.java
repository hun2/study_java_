package loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		//���� 1��
//		int i;
//		for ( i = 35 ; i<=40;  i++) {
//			System.out.print(i+ " ");
//		}
//		
		//���� 2��
//		int i;
//		for ( i = 5; i>=-5; i--) {
//			System.out.println(i + " ");
//		}
		
		
		
		//���� 3�� 
//		int i;
//		for ( i =1; i<= 50 ; i++) {
//			if ( i % 3 ==0) {
//				System.out.print(i+ " ");
//			}
//			
//		}
		
		
		//���� 3�� �ٸ����� >> �������� �޸𸮸� �� ��� �Ա⶧���� �ξ� �� ȿ������ �ڵ尡 �� �� �ִ�.
//		for ( int i = 3; i <= 50; i += 3) {
//			System.out.println(i + " ");
//		}
		
		
		//���� 4��
//		int j = 0;
//		int i;
//		for (i =1 ; i <= 100; i++) {
//			if (i % 7 ==0) {
//				j++;
//			} 
//			
//			
//		}
//		System.out.println("7�� ����� : " + j);
		
		
		
		//���� 5��
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�ܼ��� �Է��ϼ��� : ");
//		int a = scan.nextInt();
//		
//		int i = 1;
//		
//		for ( i = 1; i<= 9 ; i++ ) {
//			System.out.println(a + " X " + i + "=" + a*i);
//		}
//		
		
		
		//break ���� 1
//		Scanner scan = new Scanner(System.in);
//		
//		int a = 1;
//		while ( true) {
//			System.out.print("���� �Է��ϼ��� :");
//			int b =scan.nextInt();
//			if ( b ==0) {
//				System.out.println("��");
//				break;
//			} 
//			a++;
//		}
		
		
		// break ���� 2
//		int j = 0;
//		for ( int i = 3 ; i <= 50; i++) {
//			if ( i % 3 !=0) {
//				continue;
//				
//			} 
//			j += i;
//		
//		}
//		System.out.println(j);
		
		
		
		
		// ���չ��� 1��
//		Scanner scan = new Scanner(System.in);
//		System.out.print("���� �Է��ϼ��� : ");
//		int a = scan.nextInt();
//		int b = 0;
//		for ( int i = 1; i <= a; i++) {
//			b += i;
//			
//		}
//		System.out.println(b);
		
		
		
		// ���չ��� 2�� ���丮�� 
//		Scanner scan = new Scanner(System.in);
//		System.out.print("���� �Է��ϼ��� :");
//		int a = scan.nextInt();
//		int b = 1;
//		for ( int i = 1; i<=a; i++) {
//			b *= i;
//			
//			
//			
//		}
//		System.out.println(b);
		
		
		
		
		 //���չ��� 3�� ��� ���ϱ�
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� :");
		int a = scan.nextInt();
		int b ;
		for ( b = 1; b <= a ; b++) {
			if( a % b == 0) {
				System.out.println(b);
			} 
		}
		
		
	}

}
