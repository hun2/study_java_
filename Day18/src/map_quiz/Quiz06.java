package map_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		List <String> fruits = new ArrayList<>();
		
		
		
		while (true) {
			System.out.println("1:�Է� 2:��� 3:���� 4:����");
			int number = scan.nextInt();
			if (number == 1) {
				// �Է�
				System.out.print("���� �̸��� �Է��ϼ��� :");
				String answer = scan.next();
				
				
				//���Ĺ���
//				if (fruits.add(answer)) {
//					System.out.println("�Է� ����");
//				} else {
//					System.out.println("�Է� ����");
//				}
				
				// ���׿����ڷε� ǥ������.
				String result = fruits.add(answer) ? "�Է¼���": "�Է½���";
				System.out.println(result);
				
				
				
				
			} else if (number == 2) {
				
				//���
				for (int i =0; i < fruits.size(); i++) {
					System.out.println(fruits.get(i));
				}
				
				if (fruits.size() == 0) {
					System.out.println("��� �ֽ��ϴ�.");
				}
				
				
				
			} else if (number == 3) {
				//����
				System.out.print("������ ���� �̸��� �Է��ϼ���:");
				String deleteAnswer = scan.next();
				if (fruits.remove(deleteAnswer)) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
				
				
				
				
				
			} else if (number == 4) {
				//����
				
				System.out.println("�����մϴ�.");
				break;
				
				
			} else {
				//�߸��Է�
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				continue;
			}
		}
		
		
		
		
		
		
	}

}
