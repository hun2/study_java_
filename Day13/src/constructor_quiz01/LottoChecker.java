package constructor_quiz01;

import java.util.Random;

public class LottoChecker {

	
//	1���� 45������ 6�� ���� �������� ��÷��ȣ�� �����.
//	�ζǸ� �Է� �޾Ƽ� �ش� Ŭ������ ���� ��÷���θ� Ȯ���Ѵ�.
//
//	6��: 1��, 5��: 2��, 4��: 3��, 3��: 4��, ������: ��
	
	
	private int[] real  = new int[6];
	

	public int[] getReal() {
		return real;
	}


	public void setReal(int[] num) {
		Random rand = new Random();
		num[0] = rand.nextInt(10) + 1;
		num[1] = rand.nextInt(10) +1;
		num[2] = rand.nextInt(10) +1;
		num[3] = rand.nextInt(10) +1;
		num[4] = rand.nextInt(10) +1;
		num[5] = rand.nextInt(10) +1;
		
		this.real = num;
	}


	public LottoChecker(int[] num) {
		this.real = num;
	}
	
	
	public void Print1(Lotto lotto) {
		
		int score = 0;
		
		for (int i =0; i < this.real.length; i++) {
			
			for (int j = 0; j < lotto.getAnswer().length;  j++)
				if (this.real[i] ==  lotto.getAnswer()[j]) {
				score += 1;
			}
				
			
		}
		
		if (score <3) {
			System.out.println("��");
		} if (score == 3) {
			System.out.println("4��");
		} if (score == 4) {
			System.out.println("3��");
		} if (score == 5) {
			System.out.println("2��");
		} if (score == 6 ) {
			System.out.println("1��");
		}
	
	
	
	}
	
	
	
	
}
