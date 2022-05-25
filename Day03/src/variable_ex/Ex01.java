package variable_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//입력하기
		// ctrl + shift + o 임포트 기능 도와줌.
		
		
		System.out.println("물의 가격을 입력하셋연");
		Scanner scan = new Scanner(System.in);
			
		int water = scan.nextInt();
		
		System.out.println(water);
		System.out.println("물의 가격은" + water + "입니다.");
		
		System.out.println("물의 개수를 입력하세요");
		scan.nextInt();
		int count = scan.nextInt();
		int result = water * count;
		
		System.out.println("물의" + count + "개의 가격은" + result +"원 입니다");
		
		scan.close();	
		
		
		
		
		
	}

}
