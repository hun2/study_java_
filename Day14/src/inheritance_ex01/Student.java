package inheritance_ex01;
//�ڽ�Ŭ����
public class Student extends Person {
	
	
	private String major;
	
	
	public Student() {
		System.out.println("�л��Դϴٿ�");
	}
	
	
	public Student(String name, String major) {
		this.name = name;
		//super.name = name;
		//super(name); //������ ȣ��, �׻� ù��° �ٿ��� ��ġ�ؾ���.
		
		this.major = major;
		System.out.println("�Ķ���Ͱ� �ִ� Student ������");
	}
	
	
	// �������̵� �θ��� �޼ҵ尡 �����ȵ鶧 ������ �� �� �ִ�. �ڽĿ���
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("�׸��� �� ������ " + this.major+ " �Դϴ�.");
		
	}
	
	
	
}
