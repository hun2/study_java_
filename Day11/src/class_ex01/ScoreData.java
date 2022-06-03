package class_ex01;

//설계도
public class ScoreData {

	// 속성 : 멤버변수, 필드(field)
	
	
	int score;
	String subject;
	int ranking;
			

	
	
	
	
	
	//행위 : 메소드 
	void printInFo() {
		System.out.println("점수 :" + score);
		System.out.println("과목 :" + subject);
		System.out.println("순위 :" + ranking);
	}
	
}


