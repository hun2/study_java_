package string_ex;

public class Ex02 {

	public static void main(String[] args) {
		
		
		
		// �ڷ����� ��ȯ 
		// ���� 3���� ���ڿ� "3" ���� ��ȯ ���� => ���ڿ�
		
		// ��õ���� �ʴ� ���
		int number1 = 3;
		String str1 = number1 +""; // ���� + ���� => ����
		System.out.println(str1);
		
		
		//���� ���
		String str2 = String.valueOf(number1);
		System.out.println(str2);
	
		
		
		// ���ڸ� ���ڷ� ��ȯ ���
		String str3 = "5";
		int number2 = Integer.parseInt(str3);
		System.out.println(number2);
		int number3 = Integer.valueOf(str3);
		System.out.println(number3);
		
		
		
		
		// �Ʒ��� ���� ������ ����� String �� ������ ���� ���̸� ����ϼ���.(�ѱ�����)
		String birthday = "1995";
		int number4 = Integer.parseInt(birthday);
		System.out.println(2022 - number4 + 1 + "��");
		
			
	}
}
