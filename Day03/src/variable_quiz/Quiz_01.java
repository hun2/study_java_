package variable_quiz;

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		
		
		//1번 
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("입력 1:");
//		int x = scan.nextInt();
//		
//		System.out.print("입력 2:");
//		int b = scan.nextInt();
//		
//		
//		int sum = x/b;
//		int result = x%b;	
//		System.out.println("몫 :" + sum + " 나머지 :" +  result );
	
		
		// 2번 교체 알고리즘
//		System.out.print("x :");
//		Scanner scan = new Scanner(System.in);
//		int x = scan.nextInt();
//		System.out.print("y :");
//		int y = scan.nextInt();
//		
//		
//		System.out.println("X는 "+ y + "이고"+ "Y는"+ x + "이다.");
//		 int temp = x;
//		 x = y;
//		 y = temp;                   //  > 값 바꾸는 공식같은 것.
//		System.out.println("X는 " + x + "이고" + "Y는" + y + "이다");
//		// x의 값과 y의 값을 안바꾸고 고대로 넣고 싶다면 임시 temp 생성후 x 대입 >  그리고 y를 x에 > 다시 temp를 다시 y
		
		//3번
//		System.out.print("초 : ");
//		Scanner scan = new Scanner(System.in);
//		int x = scan.nextInt();
//		
//		int b = x / 60;
//		int c = x%60;
//		System.out.println(b  + "분 " + c+ "초");
//		
		
		
		//4번 
//		System.out.print("입력 : ");
//		Scanner scan = new Scanner(System.in);
//		int x = scan.nextInt();
//		
//
//		System.out.println(Math.round(x)/1000);
//		System.out.println(Math.round(x/100)%10);
//		System.out.println(Math.round(x/10)%10);
//		System.out.println(Math.round(x/1)%10);
		
		
		
		//5번
		
		System.out.print("입력 : ");
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt() ;
		int y = 0;		
		
				
		while ( x != 0) {
			y += x%10;
			x /= 10;
		}
		
		System.out.println("각 자리수의 합은 " + y + "이다");
		
		
	}

}
