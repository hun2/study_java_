package condition_quiz;

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
//		
//		1번	
//		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 :");
//		int a = scan.nextInt();
//		
//		
//		
//		if ( a > 10 ) {
//			System.out.println("10보다 큽니다");
//		}
//		
//		
		
//		//2번
//		Scanner scan = new Scanner(System.in);
//		System.out.print("두개의 수를 입력하세요 :");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		if ( a > b ) {
//			System.out.println("a 가 더 큽니다");
//			
//		}
//				
//		if ( a < b) {
//			System.out.println( "b 가 더 큽니다");
//		}
		
		
		
		//3번
//		Scanner scan = new Scanner(System.in);
//		System.out.print("성적을 입력하세요 :");
//		int a =  scan.nextInt();
//		
//		if ( a >= 70) {
//			System.out.println("합격입니다");
//		}
		
		
		//4번
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력 하세요 :");
		int a = scan.nextInt();
		if ( a % 2 == 0) {
			System.out.println("짝수 입니다.");
		}
		
		if ( a % 2 != 0) {
			System.out.println("홀수 입니다.");
		}
			
//		scan.close();
	}

}
