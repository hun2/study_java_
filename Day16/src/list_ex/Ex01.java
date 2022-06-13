package list_ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		
		//배열 (Array)
		//1. 크기를 미리 알고 있어야한다. 크기가 고정되어 있다.
		//2. 중간에 있는 값을 빼낸다하면 비어있는 채로 유지된다.
		//3. index 기반으로 접근이 가능하다.
		//4. 기본자료형 (primitive type), 클래스 타입(String 등) 도 담을 수 있다.
		
		
		//리스트(List) 배열의 단점을 보완하는 배열구조
		//1. 크기가 고정되어 있지 않고, 동적으로 할당된다.
		//2. 중간에 있는 값을 빼내면 앞으로 당겨진다. (메모리 낭비X)
		//3. 여러 방법으로 데이터를 다룰 수 있다.(메소드 사용 가능)
		//4. 클래스 타입만 담을 수 있다 ( 래퍼클래스만)
		//5. 타입 안정성을 보장하는 generic을 쓸 수 있다.
		
		// List Interface 의 실제 구현체인 ArrayList 사용방법
		List<Integer> list1 = new ArrayList<>();   // Animal animal = new Cat(); 느낌.
		list1.add(5);
		list1.add(3);
		boolean isSuccess = list1.add(8);
		System.out.println(isSuccess);
		System.out.println(list1);
		System.out.println(list1.toString());
		
		// List Interface 의 실제 구현체인 : LikedList 사용방법
		List<Integer> list2 = new LinkedList<>();
		list2.add(10);
		list2.add(20);
		list2.addAll(list1);
		System.out.println(list2);
		
		// 요소 수정하기
		//요소 첫번째 값을 수정하는법 10 을 1000으로 변경
		list2.set(0, 1000); // 0번째 인덱스를 1000으로 변경한다.
		System.out.println(list2);
		
		
		//요소 삭제하기
		System.out.println("삭제된 값 :" + list2.remove(1)); // index 1 삭제 => 20
		System.out.println(list2);
		
		
		//요소 삭제하기 object 방법
		Integer delVaule = 8;
		list2.remove(delVaule);
		System.out.println(list2);
		
		
		
		//String 요소 추가. 및 삭제
		List<String> strList = new ArrayList<>();
		strList.add("안녕하세요");
		strList.add("bbb");
		System.out.println(strList.remove("bbb"));
		System.out.println(strList);
		
		
		//모든 요소 삭제하기
		list2.clear();
		System.out.println(list2);
		
		
		
	}

}
