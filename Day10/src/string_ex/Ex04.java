package string_ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next(); // ��Ʈ���� �Է� �������� next(); ������ �Ѵ�
		System.out.println(word);
		
		scan.nextLine();// ���ʿ��� ���� ���������ؼ� �ϳ��� �̸� ��д�
		
		
		String test = scan.nextLine(); // ���� ( �����̽��� ���� �����ؼ� �� ������ش�)
		System.out.println(test);
		
	}

}
