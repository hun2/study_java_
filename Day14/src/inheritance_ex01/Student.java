package inheritance_ex01;
//자식클래스
public class Student extends Person {
	
	
	private String major;
	
	
	public Student() {
		System.out.println("학생입니다요");
	}
	
	
	public Student(String name, String major) {
		this.name = name;
		//super.name = name;
		//super(name); //생성자 호출, 항상 첫번째 줄에만 위치해야함.
		
		this.major = major;
		System.out.println("파라미터가 있는 Student 생성자");
	}
	
	
	// 오버라이드 부모의 메소드가 맘에안들때 재정의 할 수 있다. 자식에서
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("그리고 제 전공은 " + this.major+ " 입니다.");
		
	}
	
	
	
}
