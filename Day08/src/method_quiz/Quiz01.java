package method_quiz;

import java.util.Scanner;




public class Quiz01 {

	
	//1��
	public static int number(int num) {
		
		int a = 0;
		for (int i = 0; i <= num; i++) {
			a += i;
			if ( a > 100) {
				break;
			}
		}
		
		return a;
		
		
		
	}
	
	
	//2�� ���ϰ� ����.
	public static void number(int num, int num1, int num2, int num3, int num4) {
		
		int min = num;
		
		if ( num1 < num ) {
			min = num1;
		} if ( num2 < num) {
			min = num2;
		} if ( num3 < num ) {
			min = num3;
		} if ( num4 < num ) {
			min = num4;
		}
		System.out.println(min);
	}
	
	
	
	//3�� ���ϰ� ����.
	public static boolean number1(int num) {
		
		boolean number = true;
		// ���������� �� �����ϰ� ��밡�� > num ��� num/2 ���� �ᵵ��. �Ǵ� math.sqrt(num) �̰� num�� ��Ʈ�� ����� ���
		
		for ( int i = 2; i< num; i++) {
			if (num % i == 0) {
				number = false;
				break;
			} 
		}
		return number;
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
//		//1��
//		System.out.print("���� �Է��ϼ��� : ");
//		int a = scan.nextInt();
//		number(a);
//		System.out.println(number(a));
		
		
		//2��
//		System.out.print("5���� ���� �Է��ϼ��� : ");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		int d= scan.nextInt();
//		int e = scan.nextInt();
//		
//		number(a,b,c,d,e);
		
		
//		//3��
		System.out.print("���� �Է��ϼ���: ");
		int a = scan.nextInt();
		number1(a);
		System.out.println(number1(a));
		
		
		
		
		
	}

}
