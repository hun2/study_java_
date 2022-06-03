package class_ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		//객체로 만든다. 인스턴스 화 한다.
		ScoreData person = new ScoreData();
		
		
		//필드에 값 넣기
		person.ranking = 4;
		person.score = 80;
		person.subject = "국어";
		
		
		System.out.println(person.ranking);
		System.out.println(person.score);
		System.out.println(person.subject);
		
		
		person.printInFo();
		
		
		
		
	}

}
