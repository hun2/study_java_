package condition_quiz;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ��� :");
//		int a =  scan.nextInt();
//		
//		if ( a >= 0 ) {
//			System.out.println("���� �Դϴ�");
//		} else {
//			System.out.println("���� �Դϴ�.");
//		}
//		
		
		
		System.out.print("������ �Է��ϼ��� : ");
		int a = scan.nextInt();
		if ( a >= 90) {
			System.out.println("A");
		} else if ( a >= 80) {
			System.out.println("B");
		} else if ( a >= 70) {
			System.out.println("C");
		} else if ( a >= 60 ) {
			System.out.println("D");
		} else { 
			System.out.println("F");
		}
////		
//		System.out.print("Bmi ��ġ�� �Է��ϼ��� : ");
//		int  a  =  scan.nextInt();
//		if ( a <=  10) {
//			System.out.println("����");
//		} else if ( a <= 20) {
//			System.out.println("��ü��");
//		} else {
//			System.out.println("��");
//		}
	}

}
