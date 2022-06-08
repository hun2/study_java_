package constructor_quiz04;


public class OmrCardReader {

	
		
	
	
	
	private int[] test = new int[] {3,5,1,4,2};
	
	
	
	
	
	public OmrCardReader(int[] answer) {
		this.test = answer;
	}
	
	
	
	public void printScore(Omrcard card) {
		System.out.println(card.getName());
		System.out.println(card.getNumber());
		
		int score = 0;
		for (int i =0; i < this.test.length; i++) {
			if (this.test[i] ==  card.getAnswer()[i]) {
				score += 25;
			}
		}
		
		
		System.out.println("Á¡¼ö :" + score);
		
		
		
		
		
		
		
		
	}
	
	
	
		
		
		
		
		
}
