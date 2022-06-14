package map_ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//map 
		//1. key-value ������ �̷���� �ִ�. (�ֹι�ȣ �� �̸��� �������)
		//2. key�� �ߺ��� �����ʴ´�. value�� �ߺ��� �����ϴ�. (key���� set ����~)
		//3. key�� ���ؼ� value�� ���� ������ ã�� �� �ִ�.
		//4. value �δ� key�� ã�� ��ƴ�.
		
		
		Map<String, Integer> map1 =  new HashMap<>(); //key �� String , value�� Integer
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
		map1.put("d", 4);
		
		System.out.println(map1);
		
		// key�� �� ������.
		System.out.println(map1.get("a"));
		System.out.println(map1.get("b"));
		System.out.println(map1.get("c"));
		System.out.println(map1.get("d"));
		
		
		// �� �����Ҷ� �ٽ� �־��ָ� �ȴ�.
		map1.put("b", 200);
		System.out.println(map1);
		
		
		// "c" ��� Ű�� �����ϴ°�? ��� ������ 
		System.out.println(map1.containsKey("c"));
		
		
		//vaule �� 5�� �ִ°�?
		System.out.println(map1.containsValue(5));  // value �� �����;���.
		
		
		//��Ұ� �� ��ΰ��� ����� (�ѽ��� �ϳ���)
		System.out.println(map1.size());
		
		
		//�� key ���� �������� ���
		Set<String> keys = map1.keySet();
		System.out.println(keys);
		
		// value �� �������� ���
		Collection<Integer> values = map1.values();
		System.out.println(values);
		
		
		// key �� �����ϴ� ���
		System.out.println(map1.remove("c"));
		System.out.println(map1);
		
		
		
		//key , value ��� �����ϱ�
		map1.remove("b", 200);
		System.out.println(map1);
		
		
		//map�� map�� �߰��ϱ�
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("z", 100);
		map2.putAll(map1);
		System.out.println(map2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
