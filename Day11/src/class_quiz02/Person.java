package class_quiz02;

public class Person {

	String name;
	String year;
	String sex;
	
	
	
	void hi () {
		System.out.println("�λ縦 �Ѵ�");
	}
	
	void walk() {
		System.out.println("�ȴ´�");
	}
	
	void selfInFo() {
		System.out.println("�� �̸��� " + name + "�̰� ������ " + sex + "�̴�.");
	}
	
	void selfYear() {
		year = this.year.substring(0,4);
		int a = Integer.valueOf(year);
		
		System.out.println("���̴� " + (2022 - a+1)   + "�̴�.");
		
	}
	
}
