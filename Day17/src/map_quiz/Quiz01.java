package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {
		
		//1.  자료 입력 아래 과목 이름과 성적 정보를 Map 저장하고 출력 하세요. 국어 : 90, 수학 : 85, 영어 : 90, 사회 : 80, 과학 : 100
		
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("국어", 90);
		map1.put("수학", 85);
		map1.put("영어", 90);
		map1.put("사회", 80);
		map1.put("과학", 100);
		System.out.println(map1);
		
		
		
		//2. 값 수정 사회 시험의 채점에 문제가 있어서 5점을 더 올려야 한다. 값을 바꾸고 출력 하세요.
		map1.put("사회", 85);
		
		System.out.println(map1);
		
		
		
		//3. 값 찾기 과목명을 입력 받고, 점수를 출력 하세요. 단, 입력한 과목이 없을 경우 "자료 없음"을 출력 하세요.
//		Scanner scan = new Scanner(System.in);
//		
//		
//		System.out.print("조회할 과목명을 입력하세요 :");
//		String a = scan.next();
//				
//		if ( map1.containsKey(a)) {
//			System.out.println(a + ":" + map1.get(a));
//		}
//		else {
//			System.out.println("자료없음");
//		}
//		
////		if (map1.get(a) ==null) {
////			System.out.println("자료없음");
////		}
		
		
		
		
		
		//4. 값 찾기 90점 이상의 모든 과목을 출력하세요.
		
//		Set<String> keys = map1.keySet();
//		Iterator<String> iter = keys.iterator();
		
		Iterator<String> iter = map1.keySet().iterator();
		
		
		while (iter.hasNext()) {
			String subject = iter.next();
			if (map1.get(subject) >= 90) {
				System.out.print(subject + " ");
			}
		}
		System.out.println();
		
		
		
		
		//5. 값 확인 100점 성적이 있는 학생에게 성적 우수상을 주기로 하였다. 성적 우수상을 받을 수 있는지 출력하세요.
		if (map1.containsValue(100)) {
			System.out.println("수상 가능");
		} else {
			System.out.println("해당 없음");
		}
	
		
	}

}
