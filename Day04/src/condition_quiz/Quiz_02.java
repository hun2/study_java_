package condition_quiz;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 :");
//		int a =  scan.nextInt();
//		
//		if ( a >= 0 ) {
//			System.out.println("정수 입니다");
//		} else {
//			System.out.println("음수 입니다.");
//		}
//		
		
		
		System.out.print("점수를 입력하세요 : ");
		int a = scan.nextInt();
		if ( a >= 90) {
			System.out.println("A");
		} else if ( a >= 80) {
			System.out.println("B");
		} else if ( a >= 70) {
			System.out.println("C");
		} else if ( a >= 60 ) {
			System.out.println("D");
		} else { 
			System.out.println("F");
		}
////		
//		System.out.print("Bmi 수치를 입력하세요 : ");
//		int  a  =  scan.nextInt();
//		if ( a <=  10) {
//			System.out.println("정상");
//		} else if ( a <= 20) {
//			System.out.println("과체중");
//		} else {
//			System.out.println("비만");
//		}
	}

}
