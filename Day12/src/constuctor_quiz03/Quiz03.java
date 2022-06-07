package constuctor_quiz03;

public class Quiz03 {

	public static void main(String[] args) {
		
		
	Product product = new Product("»õ¿ì±ø", 1300, "2022-12-22");
	System.out.println();
	
	product.cost(5);	
	product.cost(13);	
	product.sell();
	
	System.out.println("================================");
	
	Product prodect1 = new Product("ÇÜ¹ö°Å", 1500, "2023-01-22");
	
	System.out.println();
	prodect1.cost(5);
	prodect1.cost(13);
	prodect1.sell();
	
	
	
	
	
	
	}

}
