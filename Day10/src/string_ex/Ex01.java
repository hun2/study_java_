package string_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// int , cahr , double , float , long ... => �⺻ �ڷ���(Primitive Type)
		// String ������ �� �����ϱ�
		
		String a = "���̿�";
		String b = new String ("���̿�");  // new �� �����ɶ� ��ü��� �Ҹ���.
		String c = new String ("���̿�");
		String d = "���̿�";
		
		
		
		//String ���� �� ���ϱ� ==�� stack ������ �ּҰ��� ���ϴ°�.
		System.out.println(a == b); // ���� Ÿ�Ը� true �� ���´�. (�޸� ������ ���Ͽ�) // �ּҺ�
		System.out.println(c == d); // ���� Ÿ�Ը� true �� ���´�. (�޸� ������ ���Ͽ�) // �ּҺ�
		 
		System.out.println(a==d); // ���� Ÿ���̱⿡ true �� ���´�. // �ּҺ�
		System.out.println(b==c); //  ���� Ÿ���̿��� �޸� ������ �ٸ��⶧���� heap �޸𸮱���. //�ּҺ�
		
		
		//String ���� �� ���ϱ����ؼ��� �ݵ�� equals ������Ѵ�.
		System.out.println(a.equals(b));
		
		
		
	}

}
