package method_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//메소드 만들기
		//1. 어떤 메소드를 만들지 메소드 명을 지어야한다.
		// 2. input을 무엇을 받을지 생각한다.
		// 3. output 을 무엇으로 돌려줄지 생각한다.
		// 4. 기능 구현
		
		
		// 메소드를 사용하는 곳 
		
		int x = 30;
		int y = 50;
//		
		int result = sum(x,y); // x, y는 전달 인자값, argument
		System.out.println(result);
		System.out.println(sum(x,y));
		
		
		printHelloWorld();
		
		
	
	
	}
	
	// 메소드를 만드는곳 ( 메인메소드 밖)
	public static int sum (int a , int b ) {
		int result = a+b;
		return a+b;
	}
	
	public static void printHelloWorld() {
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		
	// 보이드 일때는 리턴값 생략가능. 보이드 없이 int 나 변수형이 있다면 그에맞는 값 리턴값 줘야함.	
		
	}
	
	
}
