package two_d_array_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//2���� �迭 
		int [][] scores = { {10,11,12} , {50,51,52}, {71,72,73}, {91,92,93}, {100,101,120}};
		
		
		
		System.out.println("3��° �л��� �ι�° ������?" + scores[2][1]);
		System.out.println("2��° �л��� ù��° ������?" + scores[1][0]);
		System.out.println("5��° �л��� ����° ������?" + scores[4][2]);
		System.out.println("====================================================================");
		
		//�ݺ������� 2���� �迭 �� ���
//		for (int i = 0; i < scores.length; i++) {
//			for ( int j = 0; j< scores[i].length; j++) {
//				System.out.println(scores[i][j]);
//			}
//		}
		
		
//		for (int i = 0; i < scores.length; i++) {
//			for ( int j = 0; j< scores[i].length; j++) {
//				System.out.println((i+1) + "��° �л��� " + (j +1) + "��° ������" + scores[i][j] + "�̴�");
//			}
//		}
		
		
		
		//�л����� ��� ���ϱ�.
		
		for ( int i = 0; i < scores.length; i++) { //�л� ����ŭ ���°�
			int sum = 0;
			for (int j = 0; j< scores[i].length; j++) {
				
				
				sum += scores[i][j];
				
				
				
			}
			double average = sum / (double)scores.length;
			System.out.println((i+1) + "��° �л��� " + "��� ������" +average + " �̴�");
		}
		
		
	}

}
