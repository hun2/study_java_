package list_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		
		
		
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("grape");
		list.add("melon");
		
		
		// 1. index ������� ����ϱ�
		//��Ҹ� �߰��� �����ϸ� ������ ����Ƿ� �� �����ؾ��Ѵ�.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
			
			//���� b�� �����ϸ� �������
			String list1 = list.get(i);
			if (list1.startsWith("b")) {
				list.remove(i);
				i--;
			}
			
		}
		
		System.out.println(list);
		
		
		
		//2. Iterator ����ϱ�. ��� ������ ������ ���.
		
//		Iterator<String> iter = list.iterator();
//		while (iter.hasNext()) {
//			String list1 = iter.next(); // next�� �޼ҵ带 ȣ���Ҷ����� �Һ� �ǹǷ� �ݺ������� �ѹ��� �����Ѵ�.
//			// ������ �׻� ��ƶ�.
//			System.out.println(list1);
//			
//			
//			if (list1.startsWith("b")) {
//				iter.remove(); // ����Ʈ���� ���� ������ �ƴ϶� �ݵ�� iter���� remove ���� �ؾ��Ѵ�.
//			}
//		}
//		
//		System.out.println(list);
		
		
		
		
		
		//3. ���� for��
		//money in pocket => �������������� ���� ���� ���� ���� ����� �� ����.
		//�ڹ� �������� ������� �޶� , �߰��� �������� �ʴ°��� ����.
		
//		for (String lists : list) {
//			System.out.println(lists);
//			
//			
//			if(lists.startsWith("b")) {
//				list.remove(lists);
//			}
//		}
		
		
		
		
		
	}

}
