package string_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		//�������� 1�� �Ʒ� ���ڿ����� A �� B�� �ٲ㼭 ��� �ϼ���.
		
		
		
		String gradeStr = "My grade is A";
		gradeStr = gradeStr.replace("A", "B");
		System.out.println(gradeStr);
		
		
		
		// �������� 2�� ���ڿ� ���� ��ȯ �Ʒ��� ���� ��������� ����� String �� ������ ���� ���̸� ����ϼ���. (�ѱ�����)
		
		
		String birth = "19950721";
		birth = birth.substring(0, 4);
		
		
				
		int birth2 = Integer.valueOf(birth);
		System.out.println(2022 - birth2+1);
		
		//���ڿ� 19950721�� 1995�� �ٲ��� ���������� �ٲ۴� . �׸��� 2022���� ����.
//		String birth = "19950721";
//		birth = birth.replace("19950721", "1995");
//			
//		int birth2 = Integer.valueOf(birth);
//		System.out.println(2022 - birth2+1);
		
		
		
		//���ڿ� �˻� �Ʒ� ���ڿ��� �ܾ� ������ ��� �ϼ���.(�ߺ� ����)
		String sentence = "To be, or Not to Be. That Is The Question";
		
		String[] sentences = sentence.split(" ");
		
		int a = 0;
		for (int i =0; i < sentences.length; i++) {
			System.out.println(sentences[i]);
			a++;
		}
		
		System.out.println(a);
	}
	
	

}
