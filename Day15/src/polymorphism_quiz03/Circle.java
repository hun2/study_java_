package polymorphism_quiz03;

public class Circle extends Shape {

	protected double radius;
	
	
	@Override
	public void printArea() {
		System.out.println("도형은 원이며 넓이는 " + ( radius * radius ) * Math.PI  + "cm^2 입니다.");
	}
	
	
	
	
	public Circle(double radius) {
		this.radius = radius;
		
	}
	
	
	
	
}
