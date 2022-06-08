package constructor_quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		
		
		Lotto quiz = new Lotto();
		quiz.setAnswer(new int[] {1,2,3,4,5,6});

		Lotto quiz1 = new Lotto();
		quiz1.auto();
		
		
		
		LottoChecker lool = new LottoChecker(new int[6]);
		
		
		
		lool.Print1(quiz);
		lool.Print1(quiz1);
			
		
		
	}

}
