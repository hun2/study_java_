package constructor_quiz02;

public class Circle {
	
	private int radius;
	private double pi = 3.14;
	
	public Circle (int radius) {
		this.radius = radius;
		
	}
	
	public void area() {
		
		System.out.println("���� ����:"+ this.radius * this.radius * this.pi);
	}
	
	
	public void round() {
		System.out.println("���� ����:" + 2 * this.radius * this.pi);
	}
	
	
	public void area (int a) {
		
		System.out.println("���� " + a + "���� ���� :" + a * (this.radius * this.radius * this.pi));
		
	}




	
}
