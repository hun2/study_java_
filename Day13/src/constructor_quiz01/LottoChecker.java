package constructor_quiz01;

import java.util.Random;

public class LottoChecker {

	
//	1부터 45까지의 6개 수를 랜덤으로 당첨번호를 만든다.
//	로또를 입력 받아서 해당 클래스를 통해 당첨여부를 확인한다.
//
//	6개: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 나머지: 꽝
	
	
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
			System.out.println("꽝");
		} if (score == 3) {
			System.out.println("4등");
		} if (score == 4) {
			System.out.println("3등");
		} if (score == 5) {
			System.out.println("2등");
		} if (score == 6 ) {
			System.out.println("1등");
		}
	
	
	
	}
	
	
	
	
}
