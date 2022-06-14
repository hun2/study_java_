package set_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {
		
		
		
		//set
		//1. �ߺ����� �ʴ´�.
		//2. ������ ����. index �� ����.
		
		
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(3);
		set1.add(2);
		set1.add(1);
		System.out.println(set1.add(1));
		System.out.println(set1);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(11);
		set2.addAll(set1);
		
		System.out.println(set2);
		
		
		
		//set2�� 10�� �ִ°�?
		
		System.out.println(set2.contains(10));
		
		
		//set2 ���� set1�� ���¹�
		
		
		set2.removeAll(set1);
		System.out.println("set2-set1 :" + set2);
		
		
		//Tree set
		Set<String> set3 = new TreeSet<>();
		set3.add("c");
		set3.add("b");
		set3.add("a");
		System.out.println(set3);
		
		
		
		//�ݺ������� ����ϱ�
		//index �� �����Ƿ� �Ϲ� for�����δ� ���� �Ұ�
		//1. Iterator ��� ��밡�� �Ǵ� ���� for���� ����.
		
		Iterator<String> iter = set3.iterator();
		while (iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}
		
		
		
		//2. ���� for��
		
		for (Integer element : set1) {
			System.out.println(element);
						
		}
		
		
		
		
	}

}
