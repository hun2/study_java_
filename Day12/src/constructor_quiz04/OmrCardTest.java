package constructor_quiz04;

public class OmrCardTest {

	public static void main(String[] args) {
		
		int sum = 0;
		Omrcard omercard = new Omrcard();

		omercard.setName("±Ë±‚»∆");
		omercard.setNumber(20200302);
		omercard.setAnswer(new int[] {3,2,5,1,2});
		
		
		
		
		OmrCardReader reader = new OmrCardReader(new int[] {2,1,2,2,2});
		reader.printScore(omercard);
		
		
		
		
	}
	
}
