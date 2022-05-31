package method_quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		// 1번 문제 index와 값을 차례로 입력 받아서, 아래 배열에 해당하는 index에 값을 바꾸고 출력 하세요.
		
//		Scanner scan = new Scanner(System.in);
//		int[] numbers = {3, 5, 2, 10, 39};               // 0 1 2 3 4
//		System.out.print("변경할 인덱스와 값을 입력하세요 :");
//		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
		//		
		
//		numbers[a] = b;
//		
//		
//		for ( int i = 0 ; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//		
		
		
		
		//2번 점수 채점	
		
//		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
//		
//		int number = 0;
//		for ( int i = 0; i< scores.length; i++ ) {
//			if  ( scores[i] == 'O') {
//				number += 10;
//			}
//		}
//		System.out.println(number);
		
		
		
		//3번 임금 계산 / 평일 시급 : 8500원 / 주말(토,일) 시급 : 9500원
		
		
//		int wage = 0; 
//		int[] works = {3, 5, 5, 3, 5, 3, 5};
//		
//		for ( int i = 0; i < works.length ; i++) {
//			if ( i <= 4) {
//				wage = wage +(8500 * works[i]);
//			} if ( i > 4) {
//				wage = wage + (9500 * works[i]);
//			}
//		}
//		System.out.println("일주일간 총 임금은 "+ wage + "원");	
		
		
		
		
		//4번 배열 값 변경 /  길이가 5인 int 배열을 만든다. 수를 계속 입력 받으면서, 입력 받은 수가 짝수 일때만, 배열에 저장한다.
		// 배열이 가득차면 입력을 중단하고, 저장된 수들을 출력한다.
		
		
		
//		Scanner scan = new Scanner(System.in);
//		int[] number = new int[5];
//				
//		for ( int i =0; i <number.length  ; i++) {
//			
//			System.out.print("수를 입력하세요 : ");
//			int a  = scan.nextInt();
//			if ( a % 2== 0) {
//				number[i] = a;
//				
//			} 
//			else {
//				i--;
//			}
//					
//		}
//		
//		for (int i = 0 ; i<number.length; i++) {
//			System.out.print(number[i]+ " ");
//		}
						
		
		
		// 고급문제 1번 위치 변경 (swap) - 두 개의 index를 입력 받아서, 해당하는 index의 값을 서로 교체 해서 배열을 출력하세요.
		
		
//		int[] numbers = {3, 5, 2, 10, 39};
//		Scanner scan = new Scanner(System.in);
//		System.out.print("두 개의 index 를 입력하세요 :");		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = 0;
//		c = numbers[a];
//		numbers[a] = numbers[b];
//		numbers[b] = c;
//		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
		
		
		
		//고급문제 2번 배열 순서 변경 1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤섞어서 그 결과를 출력하세요.
		
//		Random rand = new Random();
//		int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};
//		
//		for ( int i = 0; i < 10; i++) {
//			int randIndex = rand.nextInt(10);
//			numbers[0] = randIndex;
//			System.out.print(numbers[0] + " ");
//		}
		
		
	}

}
