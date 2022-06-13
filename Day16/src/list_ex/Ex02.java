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
		
		
		// 1. index 기반으로 출력하기
		//요소를 중간에 제거하면 문제가 생기므로 잘 조절해야한다.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
			
			//만약 b로 시작하면 요소제거
			String list1 = list.get(i);
			if (list1.startsWith("b")) {
				list.remove(i);
				i--;
			}
			
		}
		
		System.out.println(list);
		
		
		
		//2. Iterator 사용하기. 요소 삭제시 안전한 방법.
		
//		Iterator<String> iter = list.iterator();
//		while (iter.hasNext()) {
//			String list1 = iter.next(); // next의 메소드를 호출할때마다 소비가 되므로 반복문에서 한번만 수행한다.
//			// 변수에 항상 담아라.
//			System.out.println(list1);
//			
//			
//			if (list1.startsWith("b")) {
//				iter.remove(); // 리스트에서 직접 삭제가 아니라 반드시 iter에서 remove 삭제 해야한다.
//			}
//		}
//		
//		System.out.println(list);
		
		
		
		
		
		//3. 향상된 for문
		//money in pocket => 오른쪽지갑에서 돈을 빼서 왼쪽 돈에 담고라는 걸 생각.
		//자바 버전마다 결과값이 달라서 , 중간에 삭제하지 않는것이 좋다.
		
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
