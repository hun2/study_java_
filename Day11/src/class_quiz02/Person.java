package class_quiz02;

public class Person {

	String name;
	String year;
	String sex;
	
	
	
	void hi () {
		System.out.println("인사를 한다");
	}
	
	void walk() {
		System.out.println("걷는다");
	}
	
	void selfInFo() {
		System.out.println("내 이름은 " + name + "이고 성별은 " + sex + "이다.");
	}
	
	void selfYear() {
		year = this.year.substring(0,4);
		int a = Integer.valueOf(year);
		
		System.out.println("나이는 " + (2022 - a+1)   + "이다.");
		
	}
	
}
