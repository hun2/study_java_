package list_ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(9);
		list.add(10);
		
		//list�� 5�� ����ִ°�?
		boolean containValuse = list.contains(5);
		System.out.println(containValuse);
		
		//list�� 7�� ����ִ°�?
		System.out.println(list.contains(7));
		
		// �������� ����
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		
		//�������� ����
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
		//����Ʈ�� ��� �ִ��� Ȯ���ϱ�
		System.out.println("����Ʈ�� ��� �ִ°�? " + list.isEmpty());
		
				
		list.clear(); // ���¹�
		System.out.println("����Ʈ�� ��� �ִ°�? " + list.isEmpty());
		
		
		
		
		
		
		
		
	}

}
