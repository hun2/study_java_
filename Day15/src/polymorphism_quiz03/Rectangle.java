package polymorphism_quiz03;

public class Rectangle extends Shape {
	
	
	
	@Override
	public void printArea() {
		System.out.println("������" +  super.name +  "���̴� " + super.area  + "cm^2 �Դϴ�.");
	}
	
	
	
	public Rectangle(double row, double column) {
		super.name = "�ﰢ��";
		super.area = row * column ;		
	}
	
	
}
