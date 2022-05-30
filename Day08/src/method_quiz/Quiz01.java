package method_quiz;

import java.util.Scanner;




public class Quiz01 {

	
	//1번
	public static int number(int num) {
		
		int a = 0;
		for (int i = 0; i <= num; i++) {
			a += i;
			if ( a > 100) {
				break;
			}
		}
		
		return a;
		
		
		
	}
	
	
	//2번 리턴값 없음.
	public static void number(int num, int num1, int num2, int num3, int num4) {
		
		int min = num;
		
		if ( num1 < num ) {
			min = num1;
		} if ( num2 < num) {
			min = num2;
		} if ( num3 < num ) {
			min = num3;
		} if ( num4 < num ) {
			min = num4;
		}
		System.out.println(min);
	}
	
	
	
	//3번 리턴값 없음.
	public static boolean number1(int num) {
		
		boolean number = true;
		// 수학적으로 더 간편하게 사용가능 > num 대신 num/2 으로 써도됌. 또는 math.sqrt(num) 이건 num의 루트를 씌우는 방법
		
		for ( int i = 2; i< num; i++) {
			if (num % i == 0) {
				number = false;
				break;
			} 
		}
		return number;
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
//		//1번
//		System.out.print("수를 입력하세요 : ");
//		int a = scan.nextInt();
//		number(a);
//		System.out.println(number(a));
		
		
		//2번
//		System.out.print("5개의 수를 입력하세요 : ");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		int d= scan.nextInt();
//		int e = scan.nextInt();
//		
//		number(a,b,c,d,e);
		
		
//		//3번
		System.out.print("수를 입력하세요: ");
		int a = scan.nextInt();
		number1(a);
		System.out.println(number1(a));
		
		
		
		
		
	}

}
