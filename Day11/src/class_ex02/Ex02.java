package class_ex02;

public class Ex02 {

	public static void main(String[] args) {
		
		
		
		Cellphone iphone = new Cellphone();
		iphone.maker = "삼성";
		iphone.model = "아이폰13 프로맥스";
		iphone.color = "화이트";
		iphone.price = 1500000;
		
		iphone.call();
		iphone.camera();
		System.out.println(iphone.maker);
		System.out.println(iphone.model);
		System.out.println(iphone.color);
		System.out.println(iphone.price);
		
		
		//필드 값 변경하기.
		iphone.color = "블랙";
		System.out.println(iphone.color);
		
		
		
		
		
		
		
	}

}
