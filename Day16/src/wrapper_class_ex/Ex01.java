package wrapper_class_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		
		int n1 = 5;
		System.out.println(n1);
		
		
		// Wrapper Ŭ������ �� �����ϱ�.
		Integer n2 = 5;
		System.out.println(n2);
		
				
		// Wrapper Ŭ������ �� �����ϱ�.
		Integer n3 = new Integer(5); // deprecated ��� ��� ǥ���� �Ѵ�. -> ������ ����������.
		System.out.println(n3);
		
		
		Integer n4 = 5;
		
		System.out.println(n1 == n2); // true �� �� (������ int �̹Ƿ� ���� ������ �񱳴������ ��)
		System.out.println(n1 == n3); // true �� �� (������ int �̹Ƿ� ���� ������ �񱳴������ ��)
		System.out.println(n2 == n3); // false �ּ� �񱳸� �߱⶧���� 
		System.out.println(n2 == n4); // true �ּҺ񱳸� �ߴµ� ������ ����.
		
		
		System.out.println(n2.equals(n3));
		
	}

}
