package list_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		
		//1. 1. List ����� ����Ʈ�� �־��� ������ ��������. 20 3 5 84 17
		
		
		List<Integer> list = new ArrayList<>(Arrays.asList(20,3,5,84,17));
		
		
		
		
		//2. List���� ���� ���� ���� ����ϼ���.
		int a = list.get(0);
		for (int i = 1; i<list.size(); i++) {
			
			if ( a > list.get(i)) {
				a = list.get(i);
			}
			
		}
		System.out.println(a);
		
		
		
		
		
		//3. �հ� ���ϱ� 
		Iterator<Integer> list2 = list.iterator();
		int a1 = 0;
		while (list2.hasNext()) {
			 
			a1 += list2.next();
			
		}
		
		System.out.println(a1);
	}

}
