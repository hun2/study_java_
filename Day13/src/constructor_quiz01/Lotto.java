package constructor_quiz01;

import java.util.Random;

public class Lotto {
	
	
private int[] answer;
	
//	�޼ҵ�1: ����(manual)
//	* 1���� 45������ ���ڸ� �������� 6���� �Է� �޴´�.(�ߺ� �Ұ�)
//	�޼ҵ�2: �ڵ�(auto)
//	* 1���� 45������ ���ڸ� �ߺ� ���� �ڵ����� �Է� �޴´�.
	
	
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
