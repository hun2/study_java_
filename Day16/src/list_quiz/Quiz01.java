package list_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz01 {

	public static void main(String[] args) {
		//1. List 만들기 리스트에 주어진 값들을 넣고 출력하세요.
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
		
		
		// 1-1 값을 한방에 넣는 방법 , 단 asList 는 불변의배열이라 수정이 불가.
		List<Integer> list2 = Arrays.asList(3,8,9,4,2,1,7,5);
		System.out.println(list2);
		
		//1-2 꼼수 값 한방에 넣는 방법 , 수정도 가능함.
		
		List<Integer> list3 = new ArrayList<>(Arrays.asList(3,8,9,4,2,1,7,5));
		list3.add(20);
		System.out.println(list3);
		
		
		//2. 값 수정하기 List의 네번째 값을 6으로 바꾸고 전체를 출력하세요.
		
		list1.set(3, 6);
		System.out.println(list1);
		
		//3. 값 삭제하기 List에서 8과 7을 삭제하고 전체를 출력하세요.
		Integer a = 8;
		Integer b = 7; 
		list1.remove(a);
		list1.remove(b);
		System.out.println(list1);
		
	}

}
