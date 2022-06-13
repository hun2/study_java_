package list_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz01 {

	public static void main(String[] args) {
		//1. List ����� ����Ʈ�� �־��� ������ �ְ� ����ϼ���.
		// 3, 8, 9, 4, 2, 1, 7, 5
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(8);
		list1.add(9);
		list1.add(4);
		list1.add(2);
		list1.add(1);
		list1.add(7);
		list1.add(5);
		System.out.println(list1);
		
		
		// 1-1 ���� �ѹ濡 �ִ� ��� , �� asList �� �Һ��ǹ迭�̶� ������ �Ұ�.
		List<Integer> list2 = Arrays.asList(3,8,9,4,2,1,7,5);
		System.out.println(list2);
		
		//1-2 �ļ� �� �ѹ濡 �ִ� ��� , ������ ������.
		
		List<Integer> list3 = new ArrayList<>(Arrays.asList(3,8,9,4,2,1,7,5));
		list3.add(20);
		System.out.println(list3);
		
		
		//2. �� �����ϱ� List�� �׹�° ���� 6���� �ٲٰ� ��ü�� ����ϼ���.
		
		list1.set(3, 6);
		System.out.println(list1);
		
		//3. �� �����ϱ� List���� 8�� 7�� �����ϰ� ��ü�� ����ϼ���.
		Integer a = 8;
		Integer b = 7; 
		list1.remove(a);
		list1.remove(b);
		System.out.println(list1);
		
	}

}
