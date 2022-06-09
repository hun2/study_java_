package constructor_quiz01;

public class Quiz01 {

	public static void main(String[] args) {

		Lotto quiz = new Lotto();
		int[] quizAnswer = new int[] { 24, 3, 15, 22, 26, 7 };
		quiz.setAnswer(quizAnswer);

		Lotto quiz1 = new Lotto();
		quiz1.auto();
		LottoChecker lool = new LottoChecker();
		lool.setReal();

		lool.print1(quiz);
		lool.print1(quiz1);

	}

}
