package nested_loop_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 중첩 반복문 : 반복문 안에 반복문
//		for ( int i =1; i<= 10; i++) {
//			System.out.println("스쿼트" + i + "회" );
//		}
		
		//스쿼트 3세트 10회씩
//		for (int i = 1; i<=3; i++) {
//			for( int j = 1; j<=10; j++) {
//				System.out.println("스쿼트" + j+ "회");
//			}
//			System.out.println("스쿼트 " + i + "세트째");
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("출력 하세요 :");
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
