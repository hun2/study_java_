package method_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//�޼ҵ� �����
		//1. � �޼ҵ带 ������ �޼ҵ� ���� ������Ѵ�.
		// 2. input�� ������ ������ �����Ѵ�.
		// 3. output �� �������� �������� �����Ѵ�.
		// 4. ��� ����
		
		
		// �޼ҵ带 ����ϴ� �� 
		
		int x = 30;
		int y = 50;
//		
		int result = sum(x,y); // x, y�� ���� ���ڰ�, argument
		System.out.println(result);
		System.out.println(sum(x,y));
		
		
		printHelloWorld();
		
		
	
	
	}
	
	// �޼ҵ带 ����°� ( ���θ޼ҵ� ��)
	public static int sum (int a , int b ) {
		int result = a+b;
		return a+b;
	}
	
	public static void printHelloWorld() {
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		
	// ���̵� �϶��� ���ϰ� ��������. ���̵� ���� int �� �������� �ִٸ� �׿��´� �� ���ϰ� �����.	
		
	}
	
	
}
