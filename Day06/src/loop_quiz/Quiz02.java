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
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ܼ��� �Է��ϼ��� : ");
		int a = scan.nextInt();
		
		int i = 1;
		
		for ( i = 1; i<= 9 ; i++ ) {
			System.out.println(a + " X " + i + "=" + a*i);
		}
		
		
	}

}
