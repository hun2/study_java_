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
		
		
		//문제 3번 다른형식 >> 위에보다 메모리를 덜 잡아 먹기때문에 훨씬 더 효율적인 코드가 될 수 있다.
//		for ( int i = 3; i <= 50; i += 3) {
//			System.out.println(i + " ");
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
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("단수를 입력하세요 : ");
//		int a = scan.nextInt();
//		
//		int i = 1;
//		
//		for ( i = 1; i<= 9 ; i++ ) {
//			System.out.println(a + " X " + i + "=" + a*i);
//		}
//		
		
		
		//break 문제 1
//		Scanner scan = new Scanner(System.in);
//		
//		int a = 1;
//		while ( true) {
//			System.out.print("수를 입력하세요 :");
//			int b =scan.nextInt();
//			if ( b ==0) {
//				System.out.println("끝");
//				break;
//			} 
//			a++;
//		}
		
		
		// break 문제 2
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
		
		
		
		
		// 종합문제 1번
//		Scanner scan = new Scanner(System.in);
//		System.out.print("수를 입력하세요 : ");
//		int a = scan.nextInt();
//		int b = 0;
//		for ( int i = 1; i <= a; i++) {
//			b += i;
//			
//		}
//		System.out.println(b);
		
		
		
		// 종합문제 2번 팩토리얼 
//		Scanner scan = new Scanner(System.in);
//		System.out.print("수를 입력하세요 :");
//		int a = scan.nextInt();
//		int b = 1;
//		for ( int i = 1; i<=a; i++) {
//			b *= i;
//			
//			
//			
//		}
//		System.out.println(b);
		
		
		
		
		 //종합문제 3번 약수 구하기
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요 :");
		int a = scan.nextInt();
		int b ;
		for ( b = 1; b <= a ; b++) {
			if( a % b == 0) {
				System.out.println(b);
			} 
		}
		
		
	}

}
