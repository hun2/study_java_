package condition_ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Ը� �Է��ϼ��� :");
		int weight  =  scan.nextInt();
		if ( weight <= 70) {
			System.out.println("ġŲ�� �Ե��� �Ͽ���");
		}
		else if ( weight <=80 ){
			System.out.println("�����带 �Ծ��");
		}
		
		else if ( weight <= 90) {
			System.out.println("�߰����� �Ծ��");
		}
		
		else { System.out.println("���");
		}
		
		
	}

}
