package constuctor_quiz03;

public class Product {

	private String name;
	private int cost;
	private String day;
	
	public Product (String name, int cost, String day) {
		this.name = name;
		this.cost = cost;
		this.day =day;
		
		System.out.println("이름 :" + name);
		System.out.println("가격 :" + cost );
		System.out.println("유통기한 : "+ day);
	}
	
	
	public void cost(int a ) {
		System.out.println("제품 " + a + "개의 가격 : " + (this.cost * a) );
	}
	
	public void sell() {
		
		this.day = day.replace("-", "");
		int day  = Integer.valueOf(this.day);
		if ( day >= 20221231) {
			System.out.println("판매가능상품");
		}
		else {
			System.out.println("판매불가상품");
		}

		
		
	}
	
}
