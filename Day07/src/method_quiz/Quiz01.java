package method_quiz;

import java.util.Scanner;

public class Quiz01 {

	
	public static int test(int num) {
		int a = num*num;
		return a;
		
	}
	
	
	public static double test1(double num1, double num2, double num3, double num4) {
		double aa = (num1 + num2+ num3 + num4) / 4;
		return aa;
	}
	
	
	public static void test2(int num1, int num2) {
		int a = num1 / num2 ;
		System.out.println("�� " + a);
		int b = num1 % num2;
		System.out.println("������ "+ b);
		
	}
	
	public static void test3(int num1) {
		if (num1 % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	// true false Ÿ������ �����Ÿ� �� ����� �����ϴ�.
	public static boolean test4(int num1) {
//		if ( num1 % 2 ==0) {
//			return true;
//		} return false;
		
		//���� ������, �������ǹ� 
		return num1 % 2 == 0 ? true : false;
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		//1��
//		System.out.print("�������� ���� ���ڸ� �Է��ϼ��� :");
//		int b = scan.nextInt();
//		int c = test(b);
//		System.out.println(b + " �� ������ " + c + " �̴�");
		
		
		//2��
//		System.out.print("������ �Է��ϼ��� : ");
//		double b = scan.nextDouble();
//		double c= scan.nextDouble();
//		double d= scan.nextDouble();
//		double e = scan.nextDouble();
//		
//		double f = test1(b,c,d,e);
//		System.out.println("����� " + f);
		
		//3��
//		System.out.print("���ڿ� ���� ���� �Է��ϼ��� : ");
//		int a =scan.nextInt();
//		int b = scan.nextInt();
//		
//		test2(a,b);
		
		
		//4��
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int a =scan.nextInt();
		test4(a);
		System.out.println(test4(a));
		
	}	

}
