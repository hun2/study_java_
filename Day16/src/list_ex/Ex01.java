package list_ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		
		//�迭 (Array)
		//1. ũ�⸦ �̸� �˰� �־���Ѵ�. ũ�Ⱑ �����Ǿ� �ִ�.
		//2. �߰��� �ִ� ���� �������ϸ� ����ִ� ä�� �����ȴ�.
		//3. index ������� ������ �����ϴ�.
		//4. �⺻�ڷ��� (primitive type), Ŭ���� Ÿ��(String ��) �� ���� �� �ִ�.
		
		
		//����Ʈ(List) �迭�� ������ �����ϴ� �迭����
		//1. ũ�Ⱑ �����Ǿ� ���� �ʰ�, �������� �Ҵ�ȴ�.
		//2. �߰��� �ִ� ���� ������ ������ �������. (�޸� ����X)
		//3. ���� ������� �����͸� �ٷ� �� �ִ�.(�޼ҵ� ��� ����)
		//4. Ŭ���� Ÿ�Ը� ���� �� �ִ� ( ����Ŭ������)
		//5. Ÿ�� �������� �����ϴ� generic�� �� �� �ִ�.
		
		// List Interface �� ���� ����ü�� ArrayList �����
		List<Integer> list1 = new ArrayList<>();   // Animal animal = new Cat(); ����.
		list1.add(5);
		list1.add(3);
		boolean isSuccess = list1.add(8);
		System.out.println(isSuccess);
		System.out.println(list1);
		System.out.println(list1.toString());
		
		// List Interface �� ���� ����ü�� : LikedList �����
		List<Integer> list2 = new LinkedList<>();
		list2.add(10);
		list2.add(20);
		list2.addAll(list1);
		System.out.println(list2);
		
		// ��� �����ϱ�
		//��� ù��° ���� �����ϴ¹� 10 �� 1000���� ����
		list2.set(0, 1000); // 0��° �ε����� 1000���� �����Ѵ�.
		System.out.println(list2);
		
		
		//��� �����ϱ�
		System.out.println("������ �� :" + list2.remove(1)); // index 1 ���� => 20
		System.out.println(list2);
		
		
		//��� �����ϱ� object ���
		Integer delVaule = 8;
		list2.remove(delVaule);
		System.out.println(list2);
		
		
		
		//String ��� �߰�. �� ����
		List<String> strList = new ArrayList<>();
		strList.add("�ȳ��ϼ���");
		strList.add("bbb");
		System.out.println(strList.remove("bbb"));
		System.out.println(strList);
		
		
		//��� ��� �����ϱ�
		list2.clear();
		System.out.println(list2);
		
		
		
	}

}
