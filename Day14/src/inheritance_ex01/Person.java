package inheritance_ex01;

//�θ�Ŭ����
public class Person {

	protected String name;
	
	

	public Person() {
		System.out.println("����~~");
	}
	
	
	public Person(String name) {
		this.name = name;
		System.out.println("�Ķ���Ͱ� �ִ� Person ������");
	}
	
	
	public void introduce() {
		System.out.println("�� �̸��� "+ this.name + " �Դϴ�.");
	}
	
	
	
}
