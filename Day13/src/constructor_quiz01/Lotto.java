package constructor_quiz01;

import java.util.Random;

public class Lotto {
	
	
private int[] answer;
	
//	메소드1: 수동(manual)
//	* 1부터 45까지의 숫자를 수동으로 6개를 입력 받는다.(중복 불가)
//	메소드2: 자동(auto)
//	* 1부터 45까지의 숫자를 중복 없이 자동으로 입력 받는다.
	
	
	public int[] getAnswer() {
		return answer;
	}
	public void setAnswer(int[] answer) {
		this.answer = answer;
	}
	
	public int[] auto() {
		Random rand = new Random();
		int[] num = new int[6];
		for (int i= 0; i<num.length; i++) {
			num[i] = rand.nextInt(45) + 1;
			for (int j =0; j<i; j++) {
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
				
		this.answer = num;
		return this.answer;
	}
	
}
