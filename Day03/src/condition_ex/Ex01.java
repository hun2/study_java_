package condition_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요 :");
		int weight = scan.nextInt();
		
		if ( weight  == 68 ) {
			System.out.println("당신의 몸무게는 " + weight + "kg입니다");
		
		}
		
		if ( weight != 75) {
			System.out.println("당신의 몸무게는 75kg 가 아닙니다.");
		}	
		
		
//		System.out.print("당신의 점수는 몇점일거 같으세요? :");
//		int x =  scan.nextInt();
//		
//		if  ( x>= 90) {
//			System.out.println("수학점수가 90점 이상이네요");
//			
//			
//		}
//		else if ( x> 80) {
//			System.out.println("수학점수가 80점 이상이네요");
//		}
//		else {
//			System.out.println("빙시네요");
//		}
		
		scan.close();
		
		
		
		
		
		
	}

}
