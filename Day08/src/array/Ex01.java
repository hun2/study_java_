package array;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// �迭�� ���� �ִ´� = �ʱ�ȭ
		
		int[] score = new int[7];
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		score[5] = 6;
		score[6] = 7;
		
		
		
//		System.out.println("ù��° �� " + score[0]);
//		System.out.println("�ι�° �� " + score[1]);
//		System.out.println("����° �� " + score[2]);
//		System.out.println("�׹�° �� " + score[3]);
//		System.out.println("�ټ���° �� " + score[4]);
//		System.out.println("������° �� " + score[5]);
//		System.out.println("�ϰ���° �� " + score[6]);
		
		
		
		
		int [] scores = {90, 89, 71, 81};
		
		
		
		
		//�迭�� �� ����
//		score [0] = 100;
//		System.out.println(score[0]);
		
		
		
		
		//�ݺ����� �̿��� �迭 �� ���
//		for ( int i = 0; i< score.length; i++) {
//			System.out.println(score[i]);
//		}
		
		
		
		//�հ� ���ϱ�
		int sum = 0;
		for (int i =0; i<score.length; i ++ ) {
			sum += score[i];
			
		}
		System.out.println(sum);
	}

}
