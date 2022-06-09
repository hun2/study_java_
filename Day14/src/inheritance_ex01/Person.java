package inheritance_ex01;

//부모클래스
public class Person {

	protected String name;
	
	

	public Person() {
		System.out.println("응애~~");
	}
	
	
	public Person(String name) {
		this.name = name;
		System.out.println("파라미터가 있는 Person 생성자");
	}
	
	
	public void introduce() {
		System.out.println("내 이름은 "+ this.name + " 입니다.");
	}
	
	
	
}
