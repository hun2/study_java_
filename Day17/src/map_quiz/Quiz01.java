package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {
		
		//1.  �ڷ� �Է� �Ʒ� ���� �̸��� ���� ������ Map �����ϰ� ��� �ϼ���. ���� : 90, ���� : 85, ���� : 90, ��ȸ : 80, ���� : 100
		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("����", 90);
		map1.put("����", 85);
		map1.put("����", 90);
		map1.put("��ȸ", 80);
		map1.put("����", 100);
		System.out.println(map1);
		
		
		
		//2. �� ���� ��ȸ ������ ä���� ������ �־ 5���� �� �÷��� �Ѵ�. ���� �ٲٰ� ��� �ϼ���.
		map1.put("��ȸ", 85);
		
		System.out.println(map1);
		
		
		
		//3. �� ã�� ������� �Է� �ް�, ������ ��� �ϼ���. ��, �Է��� ������ ���� ��� "�ڷ� ����"�� ��� �ϼ���.
//		Scanner scan = new Scanner(System.in);
//		
//		
//		System.out.print("��ȸ�� ������� �Է��ϼ��� :");
//		String a = scan.next();
//				
//		if ( map1.containsKey(a)) {
//			System.out.println(a + ":" + map1.get(a));
//		}
//		else {
//			System.out.println("�ڷ����");
//		}
//		
////		if (map1.get(a) ==null) {
////			System.out.println("�ڷ����");
////		}
		
		
		
		
		
		//4. �� ã�� 90�� �̻��� ��� ������ ����ϼ���.
		
//		Set<String> keys = map1.keySet();
//		Iterator<String> iter = keys.iterator();
		
		Iterator<String> iter = map1.keySet().iterator();
		
		
		while (iter.hasNext()) {
			String subject = iter.next();
			if (map1.get(subject) >= 90) {
				System.out.print(subject + " ");
			}
		}
		System.out.println();
		
		
		
		
		//5. �� Ȯ�� 100�� ������ �ִ� �л����� ���� ������� �ֱ�� �Ͽ���. ���� ������� ���� �� �ִ��� ����ϼ���.
		if (map1.containsValue(100)) {
			System.out.println("���� ����");
		} else {
			System.out.println("�ش� ����");
		}
	
		
	}

}
