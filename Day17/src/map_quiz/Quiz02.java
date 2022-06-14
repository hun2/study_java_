package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		// Map에 키에 이름(유재석, 박나래, 이지은, 서장훈, 이광수)을 넣고, 값을 모두 'X'로 초기화 하세요.
		
		Map<String, String> map1 = new HashMap<>();
		map1.put("유재석", "x");
		map1.put("박나래", "x");
		map1.put("이지은", "x");
		map1.put("서장훈", "x");
		map1.put("이광수", "x");
		
		
		
		// 성씨가 '이'씨인 경우에는 값을 'O'로 바꾼다.
		
		Iterator<String> iter = map1.keySet().iterator();
		
		while(iter.hasNext()) {
			String name = iter.next();
			if (name.startsWith("이")) {
				map1.put(name, "o");
			}
			
		}
		System.out.println(map1);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
