package method_quiz;

import java.util.Scanner;

public class Quiz01 {

	
	public static int test(int num) {
		int a = num*num;
		return a;
		
	}
	
	
	public static double test1(double num1, double num2, double num3, double num4) {
		double aa = (num1 + num2+ num3 + num4) / 4;
		return aa;
	}
	
	
	public static void test2(int num1, int num2) {
		int a = num1 / num2 ;
		System.out.println("몫 " + a);
		int b = num1 % num2;
		System.out.println("나머지 "+ b);
		
	}
	
	public static void test3(int num1) {
		if (num1 % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	// true false 타입으로 조질거면 이 방법도 가능하다.
	public static boolean test4(int num1) {
//		if ( num1 % 2 ==0) {
//			return true;
//		} return false;
		
		//삼항 연산자, 삼항조건문 
		return num1 % 2 == 0 ? true : false;
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		//1번
//		System.out.print("제곱값을 구할 숫자를 입력하세요 :");
//		int b = scan.nextInt();
//		int c = test(b);
//		System.out.println(b + " 의 제곱은 " + c + " 이다");
		
		
		//2번
//		System.out.print("점수를 입력하세요 : ");
//		double b = scan.nextDouble();
//		double c= scan.nextDouble();
//		double d= scan.nextDouble();
//		double e = scan.nextDouble();
//		
//		double f = test1(b,c,d,e);
//		System.out.println("평균은 " + f);
		
		//3번
//		System.out.print("숫자와 나눌 수를 입력하세요 : ");
//		int a =scan.nextInt();
//		int b = scan.nextInt();
//		
//		test2(a,b);
		
		
		//4번
		System.out.print("숫자를 입력하세요 : ");
		int a =scan.nextInt();
		test4(a);
		System.out.println(test4(a));
		
	}	

}
