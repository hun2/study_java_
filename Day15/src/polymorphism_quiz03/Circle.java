package polymorphism_quiz03;

public class Circle extends Shape {

	protected double radius;
	
	
	@Override
	public void printArea() {
		System.out.println("������ ���̸� ���̴� " + ( radius * radius ) * Math.PI  + "cm^2 �Դϴ�.");
	}
	
	
	
	
	public Circle(double radius) {
		this.radius = radius;
		
	}
	
	
	
	
}
