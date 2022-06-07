package constructor_quiz02;

public class Circle {
	
	private int radius;
	private double pi = 3.14;
	
	public Circle (int radius) {
		this.radius = radius;
		
	}
	
	public void area() {
		
		System.out.println("원의 넓이:"+ this.radius * this.radius * this.pi);
	}
	
	
	public void round() {
		System.out.println("원의 지름:" + 2 * this.radius * this.pi);
	}
	
	
	public void area (int a) {
		
		System.out.println("원의 " + a + "개의 넓이 :" + a * (this.radius * this.radius * this.pi));
		
	}




	
}
