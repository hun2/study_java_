package string_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		// id를 입력받고 출력하시오
		Scanner scan = new Scanner(System.in);
//		System.out.print("ID를 입력 하세요 : ");
//		String word = scan.next();
//		System.out.println("Welcome! " + word);
		
		
		
		
		//문자열 검색 영어 단어를 입력 받고 'e' 가 몇 개 들어 있는지 출력 하세요.
		System.out.print("단어를 입력하세요 : " );
		String word2 = scan.next();

		
		//contains : 특정 문자열이 문자열에 포함되어 있는지 확인
		int count = 0;
		
		for (int i =0; i< word2.length() ; i++)
		if ( word2.contains("e")) {
			count++;
		}
		else {
		}
		System.out.println("e의 개수는 :" + count + "개 입니다.");
				
		
		
	}

}
