package polymorphism_quiz03;

public class Triangle extends Shape {
	
	
	
		
	@Override
	public void printArea() {
		System.out.println("도형은 " + super.name +  " 넓이는" +  super.area  + "cm^2 입니다.");
	}
	
	
	public Triangle(double base, double height) {
		
		super.name = "삼각형";
		super.area = base * height / 2;
	}
	
	
}
