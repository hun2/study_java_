package condition_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//두 개의 수를 입력받고 비교하기
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("두 개의 수를 입력하세요 :");
		int number1= scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println(number1);
		System.out.println(number2);
		
		if ( number1 > number2 ) {
			System.out.println("참");
		}
		else {
			System.out.println("거짓");
		}
		
		
		
		
	}

}
