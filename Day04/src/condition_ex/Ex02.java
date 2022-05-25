package condition_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.print("걸음 수와 몸무게를 입력하세요 :");	
		int walk = scan.nextInt();
		int weight = scan.nextInt();
		
		if ( walk > 10000 && weight <= 60 ) {
			System.out.println("치킨을 먹을 수 있다");
		}
		else {
			System.out.println("다이어트 하셈");
		}
//		
		
		if ( walk > 10000 || weight <=60) {
			System.out.println("치킨을 먹을 수 있다");
			
		}
		else {
			System.out.println("둘다 해당안되니 넌 다이어트 해라");
		}
		
	}

}
