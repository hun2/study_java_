package string_ex;

public class Ex03 {

	public static void main(String[] args) {
		
		
		String st1 = "eclipse";
		
		// charAt : n��°�� ���� ���ڰ� �ִ��� ? ���� ���� �޼ҵ�.
		
		
		System.out.println("charAt:" + st1.charAt(4));
		
				
		
		//contains : Ư�� ���ڿ��� ���ڿ��� ���ԵǾ� �ִ��� Ȯ��
		
		System.out.println("contains :" + st1.contains("lip"));
		
		
		
		// startsWith : Ư�� ���ڿ��� �����ϴ��� Ȯ��
		
		System.out.println("statrsWith :" + st1.startsWith("ecl"));
		
		
		
		// endsWith : Ư�� ���ڿ��� ������ �� Ȯ��
		
		System.out.println("endWith :" + st1.endsWith("se"));
		
		
		// length : ���ڿ��� ���̸� Ȯ���ϴ�, ���ĺ��� ����
		
		System.out.println("length :" + st1.length() );
		
		
		// replace : ���Ե� ���ڿ� �κ��� ��ü
		
		String st2 = "���� ���� �԰� ���� ���� ġŲ�̴�.";
		st2 = st2.replace("ġŲ", "����"); // �� ��������� �Ѵ�.
		System.out.println(st2);
			
		
		// split : Ư�� ��Ʈ���� �������� �߶� �迭�� �ִ´�.
		
		String st3 = "apple,melon,grape";
		String[] fruits = st3.split(",");
		for ( int i = 0 ; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		
		
		// substring : ���ڿ��� �ڸ���.
		String st4 = "javastudy";
		System.out.println("substring :" + st4.substring(4)); //�ε��� ��ȣ�� �ִ´�.
		
		
		// ���ڸ��� ¥������ ���ڰ��� �ΰ��� �Ѱ��ִ� ������� �ؾ��Ѵ�.
		System.out.println("substring :" + st4.substring(0, 4)); //�ε��� ��ȣ�� �ִ´�. ��� ������ �ε��� ��ȣ�� 1�� ���Ѵ� �����ض�.
		System.out.println("substring :"+ st4.substring(4, 9)); // 4���� 8�������� ��������ȣ�� 1�� ������� �Ѵ�.
		
		
		
		
		
		
		
		
	}

}
