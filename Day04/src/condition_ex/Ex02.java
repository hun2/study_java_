package condition_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �����Ը� �Է��ϼ��� :");	
		int walk = scan.nextInt();
		int weight = scan.nextInt();
		
		if ( walk > 10000 && weight <= 60 ) {
			System.out.println("ġŲ�� ���� �� �ִ�");
		}
		else {
			System.out.println("���̾�Ʈ �ϼ�");
		}
//		
		
		if ( walk > 10000 || weight <=60) {
			System.out.println("ġŲ�� ���� �� �ִ�");
			
		}
		else {
			System.out.println("�Ѵ� �ش�ȵǴ� �� ���̾�Ʈ �ض�");
		}
		
	}

}
