package polymorphism_quiz03;

public class Rectangle extends Shape {
	
	
	
	@Override
	public void printArea() {
		System.out.println("도형은" +  super.name +  "넓이는 " + super.area  + "cm^2 입니다.");
	}
	
	
	
	public Rectangle(double row, double column) {
		super.name = "삼각형";
		super.area = row * column ;		
	}
	
	
}
