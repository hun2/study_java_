package polymorphism_quiz03;

public class Triangle extends Shape {
	
	
	
		
	@Override
	public void printArea() {
		System.out.println("������ " + super.name +  " ���̴�" +  super.area  + "cm^2 �Դϴ�.");
	}
	
	
	public Triangle(double base, double height) {
		
		super.name = "�ﰢ��";
		super.area = base * height / 2;
	}
	
	
}
