package class_quiz01;

public class Student {

	String name;
	String subject;
	int age;
	String number;
	


	void isAdult () {
		if ( age >= 20 ) {
			System.out.println("" + this.name + " 은 성인입니다."); 
		
		} else {
			System.out.println("" + this.name + " 은 미성년자 입니다.");
		}
	}
	
	
	
	
}
