package variable_ex;

public class Ex02 {

	public static void main(String[] args) {
		
		double pi = 3.14;
		int intpi = (int)pi;
		System.out.println(intpi);
		
		System.out.println((double)intpi); // �Ҽ������� ���



		int number = 7;
		double result =  number / 2 ;   // int / int ������ ���� ���Ǳ⶧���� 3.5 �� ��µȴ�.
																		//���尪 ���� double ���� �߱⶧���� 3.5���� �Ҽ��� ����.

		System.out.println(result); // �Ҽ��� ���� 3.0 ��µ�.

		// �� �� �ϳ��� ���� �Ǽ��� ����ȯ �ϰų�
		result =  (double)number / 2 ;

		//�Ǽ��� �����ų�

		result =  number / 2.0 ;


		//�ݿø� �ϴ¹�
		double haha = 3.14129011023013213213;
		Math.round(haha);
		System.out.println(Math.round(haha));
		
		
		
		
		
		
		
		
		
		
	}

}
