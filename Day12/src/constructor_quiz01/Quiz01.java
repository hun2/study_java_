package constructor_quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		Rectangle rect1 = new Rectangle(30,50);
		System.out.println("����:" + rect1.width() + "cm^2");
		System.out.println("�ѷ�:" + rect1.round() + "cm");
	
	
		Rectangle rect2 = new Rectangle(10,10);
		System.out.println("����:" + rect2.width() + "cm^2");
		System.out.println("�ѷ�:" + rect2.round() + "cm");
	}

}
