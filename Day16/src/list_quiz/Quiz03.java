package list_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {
		
		
		
		
		//1�� ü�� ��� ��� ���� [8, 7, 6, 10, 9, 4]
		List<Integer> list = new ArrayList<>(Arrays.asList(8, 7, 6, 10, 9, 4));
		
		
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		
		list.remove(0);
		list.remove(list.size() - 1);
		System.out.println(list);
		
		int sum = 0 ;
		for (int i =0; i < list.size(); i++) {
			sum += list.get(i);
			
		}
		
		
		System.out.println("�������� �ְ����� ������ ��� ������ " + (double)sum / list.size());
		
		
		
		
	}

}
