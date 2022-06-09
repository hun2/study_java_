package constructor_quiz01;

import java.util.Random;

public class LottoChecker {

//	1���� 45������ 6�� ���� �������� ��÷��ȣ�� �����.
//	�ζǸ� �Է� �޾Ƽ� �ش� Ŭ������ ���� ��÷���θ� Ȯ���Ѵ�.
//	6��: 1��, 5��: 2��, 4��: 3��, 3��: 4��, ������: ��	

	private int[] real;

	public void setReal() {
		int[] num = new int[6];
		Random rand = new Random();
		this.real = num;
		for (int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					j--;
				}
			}
		}
	}

	public void print1(Lotto lotto) {
		int score = 0;
		for (int i = 0; i < this.real.length; i++) {
			for (int j = 0; j < lotto.getAnswer().length; j++)
				if (this.real[i] == lotto.getAnswer()[j]) {
					score += 1;
				}
		}

		if (score < 3) {
			System.out.println("��");
		} else if (score == 3) {
			System.out.println("4��");
		} else if (score == 4) {
			System.out.println("3��");
		} else if (score == 5) {
			System.out.println("2��");
		} else if (score == 6) {
			System.out.println("1��");
		}

	}

}
