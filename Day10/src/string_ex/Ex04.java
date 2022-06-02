package string_ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next(); // 스트링을 입력 받을때는 next(); 까지만 한다
		System.out.println(word);
		
		scan.nextLine();// 불필요한 엔터 날리기위해서 하나를 미리 써둔다
		
		
		String test = scan.nextLine(); // 문장 ( 스페이스바 까지 포함해서 다 출력해준다)
		System.out.println(test);
		
	}

}
