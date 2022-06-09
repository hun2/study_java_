package constructor_quiz01;

import java.util.Random;

public class LottoChecker {

//	1부터 45까지의 6개 수를 랜덤으로 당첨번호를 만든다.
//	로또를 입력 받아서 해당 클래스를 통해 당첨여부를 확인한다.
//	6개: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 나머지: 꽝	

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
			System.out.println("꽝");
		} else if (score == 3) {
			System.out.println("4등");
		} else if (score == 4) {
			System.out.println("3등");
		} else if (score == 5) {
			System.out.println("2등");
		} else if (score == 6) {
			System.out.println("1등");
		}

	}

}
