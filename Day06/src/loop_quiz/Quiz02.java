package loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		//문제 1번
//		int i;
//		for ( i = 35 ; i<=40;  i++) {
//			System.out.print(i+ " ");
//		}
//		
		//문제 2번
//		int i;
//		for ( i = 5; i>=-5; i--) {
//			System.out.println(i + " ");
//		}
		
		
		
		//문제 3번 
//		int i;
//		for ( i =1; i<= 50 ; i++) {
//			if ( i % 3 ==0) {
//				System.out.print(i+ " ");
//			}
//			
//		}
		
		
		
		//문제 4번
//		int j = 0;
//		int i;
//		for (i =1 ; i <= 100; i++) {
//			if (i % 7 ==0) {
//				j++;
//			} 
//			
//			
//		}
//		System.out.println("7의 배수는 : " + j);
		
		
		
		//문제 5번
		
		Scanner scan = new Scanner(System.in);
		System.out.println("단수를 입력하세요 : ");
		int a = scan.nextInt();
		
		int i = 1;
		
		for ( i = 1; i<= 9 ; i++ ) {
			System.out.println(a + " X " + i + "=" + a*i);
		}
		
		
	}

}
