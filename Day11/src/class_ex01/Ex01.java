package class_ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		//��ü�� �����. �ν��Ͻ� ȭ �Ѵ�.
		ScoreData person = new ScoreData();
		
		
		//�ʵ忡 �� �ֱ�
		person.ranking = 4;
		person.score = 80;
		person.subject = "����";
		
		
		System.out.println(person.ranking);
		System.out.println(person.score);
		System.out.println(person.subject);
		
		
		person.printInFo();
		
		
		
		
	}

}
