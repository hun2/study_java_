package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		// Map�� Ű�� �̸�(���缮, �ڳ���, ������, ������, �̱���)�� �ְ�, ���� ��� 'X'�� �ʱ�ȭ �ϼ���.
		
		Map<String, String> map1 = new HashMap<>();
		map1.put("���缮", "x");
		map1.put("�ڳ���", "x");
		map1.put("������", "x");
		map1.put("������", "x");
		map1.put("�̱���", "x");
		
		
		
		// ������ '��'���� ��쿡�� ���� 'O'�� �ٲ۴�.
		
		Iterator<String> iter = map1.keySet().iterator();
		
		while(iter.hasNext()) {
			String name = iter.next();
			if (name.startsWith("��")) {
				map1.put(name, "o");
			}
			
		}
		System.out.println(map1);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
