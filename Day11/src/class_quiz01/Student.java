package class_quiz01;

public class Student {

	String name;
	String subject;
	int age;
	String number;
	


	void isAdult () {
		if ( age >= 20 ) {
			System.out.println("" + this.name + " �� �����Դϴ�."); 
		
		} else {
			System.out.println("" + this.name + " �� �̼����� �Դϴ�.");
		}
	}
	
	
	
	
}
