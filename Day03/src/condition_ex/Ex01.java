package condition_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����Ը� �Է��ϼ��� :");
		int weight = scan.nextInt();
		
		if ( weight  == 68 ) {
			System.out.println("����� �����Դ� " + weight + "kg�Դϴ�");
		
		}
		
		if ( weight != 75) {
			System.out.println("����� �����Դ� 75kg �� �ƴմϴ�.");
		}	
		
		
//		System.out.print("����� ������ �����ϰ� ��������? :");
//		int x =  scan.nextInt();
//		
//		if  ( x>= 90) {
//			System.out.println("���������� 90�� �̻��̳׿�");
//			
//			
//		}
//		else if ( x> 80) {
//			System.out.println("���������� 80�� �̻��̳׿�");
//		}
//		else {
//			System.out.println("���ó׿�");
//		}
		
		scan.close();
		
		
		
		
		
		
	}

}
