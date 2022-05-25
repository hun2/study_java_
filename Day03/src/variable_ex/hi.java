package variable_ex;

import java.util.Scanner;

public class hi {

	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner (System.in);

		// 구구단 문제
//		System.out.print("구구단을 시작해보겠습니다 : ");
//		int a = scan.nextInt();
//		for ( int i = 1; i<= 9; i++) {
//				System.out.println(a+ "*" + i + "=" + (a*i));
//		}
//		
		
		
		// 0부터 20까지 출력해보자
		
//		for ( int i = 0; i <= 20; i++) {
//			System.out.println(i + "");
//		}
		
		// 0부터 90까지 10단위로 출력해보자
//		for ( int i = 0; i <= 90; i+=10) {
//			System.out.println(i);
//		}
		
		// 0부터 10까지 모두 더한 값을 출력해보자
//		int sum = 0;
//		for ( int i = 0; i <= 10 ; i ++) {
//			sum += i;
////		
//		int sum = 0;
//		for ( int i = 0; i < 5 ;  i++) {
//			System.out.println("숫자를 5개 입력하세요");
//			int num = scan.nextInt();
//			sum += num;
//			System.out.println("출력" + sum);
		
		// 0부터 20까지 짝수만 출력해보자.
//		
//		for ( int i = 0; i < 21 ; i++) {
//			if (  i % 2 == 0) {
//				System.out.println(i + " ");
//			}
		
		//숫자 하나를 입력받아 1부터 그 숫자합까지 덧셈
//		System.out.print("숫자를 입력 하세요 : ");
//		int num = scan.nextInt();
//		int sum = 0;
//		
//		for ( int i = 1; i<= 5; i++) {
//			sum += num;
//			System.out.println("1부터 " + num + "까지 합은" + sum  + " 입니다.");
		
		//
		//영희가 은행에 500원(원금)을 입금했다. 하루에 1원씩 이자가 붙는다. 5일 후(일수) 잔액은 얼마가 되어 있을까?

		int sum = 500;
		for ( int i = 1 ; i <= 5; i++) {
				sum ++;
		
		
		}
		System.out.println(sum);
}
}
