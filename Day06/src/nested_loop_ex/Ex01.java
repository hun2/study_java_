package nested_loop_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// ��ø �ݺ��� : �ݺ��� �ȿ� �ݺ���
//		for ( int i =1; i<= 10; i++) {
//			System.out.println("����Ʈ" + i + "ȸ" );
//		}
		
		//����Ʈ 3��Ʈ 10ȸ��
//		for (int i = 1; i<=3; i++) {
//			for( int j = 1; j<=10; j++) {
//				System.out.println("����Ʈ" + j+ "ȸ");
//			}
//			System.out.println("����Ʈ " + i + "��Ʈ°");
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��� �ϼ��� :");
		int a =scan.nextInt();
		
		
		
		
//		for ( int i = 1; i <= a; i++) {
//			int b = 0;
//			for (int j = 1; j <= i; j++) {
//				
//				if (j ==1) {
//					b=i;
//					System.out.print(b+ ",");
//				} else {
//					b=b+(a-j)+1;
//					System.out.print(b+ ",");
//				}
//			} System.out.println();
//		}
		
		
		for ( int i = 1; i <= a; i++) {
			int b = 0;
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
				
				
			} System.out.println();
		}
		
		
		
	}
}
