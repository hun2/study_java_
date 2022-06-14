package map_ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//map 
		//1. key-value 쌍으로 이루어져 있다. (주민번호 와 이름의 관계느낌)
		//2. key는 중복이 되지않는다. value는 중복이 가능하다. (key들은 set 느낌~)
		//3. key를 통해서 value를 아주 빠르게 찾을 수 있다.
		//4. value 로는 key를 찾기 어렵다.
		
		
		Map<String, Integer> map1 =  new HashMap<>(); //key 는 String , value는 Integer
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
		map1.put("d", 4);
		
		System.out.println(map1);
		
		// key로 값 얻어오기.
		System.out.println(map1.get("a"));
		System.out.println(map1.get("b"));
		System.out.println(map1.get("c"));
		System.out.println(map1.get("d"));
		
		
		// 값 수정할때 다시 넣어주면 된다.
		map1.put("b", 200);
		System.out.println(map1);
		
		
		// "c" 라는 키가 존재하는가? 라고 물을때 
		System.out.println(map1.containsKey("c"));
		
		
		//vaule 에 5가 있는가?
		System.out.println(map1.containsValue(5));  // value 로 가져와야함.
		
		
		//요소가 총 몇개인가를 물어볼때 (한쌍이 하나임)
		System.out.println(map1.size());
		
		
		//★ key 값만 가져오는 방법
		Set<String> keys = map1.keySet();
		System.out.println(keys);
		
		// value 만 가져오는 방법
		Collection<Integer> values = map1.values();
		System.out.println(values);
		
		
		// key 값 삭제하는 방법
		System.out.println(map1.remove("c"));
		System.out.println(map1);
		
		
		
		//key , value 요소 삭제하기
		map1.remove("b", 200);
		System.out.println(map1);
		
		
		//map에 map을 추가하기
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("z", 100);
		map2.putAll(map1);
		System.out.println(map2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
