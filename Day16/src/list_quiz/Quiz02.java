package list_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		
		//1. 1. List 만들기 리스트에 주어진 값들을 넣으세요. 20 3 5 84 17
		
		
		List<Integer> list = new ArrayList<>(Arrays.asList(20,3,5,84,17));
		
		
		
		
		//2. List에서 가장 작은 값을 출력하세요.
		int a = list.get(0);
		for (int i = 1; i<list.size(); i++) {
			
			if ( a > list.get(i)) {
				a = list.get(i);
			}
			
		}
		System.out.println(a);
		
		
		
		
		
		//3. 합계 구하기 
		Iterator<Integer> list2 = list.iterator();
		int a1 = 0;
		while (list2.hasNext()) {
			 
			a1 += list2.next();
			
		}
		
		System.out.println(a1);
	}

}
