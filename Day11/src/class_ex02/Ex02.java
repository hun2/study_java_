package class_ex02;

public class Ex02 {

	public static void main(String[] args) {
		
		
		
		Cellphone iphone = new Cellphone();
		iphone.maker = "�Ｚ";
		iphone.model = "������13 ���θƽ�";
		iphone.color = "ȭ��Ʈ";
		iphone.price = 1500000;
		
		iphone.call();
		iphone.camera();
		System.out.println(iphone.maker);
		System.out.println(iphone.model);
		System.out.println(iphone.color);
		System.out.println(iphone.price);
		
		
		//�ʵ� �� �����ϱ�.
		iphone.color = "��";
		System.out.println(iphone.color);
		
		
		
		
		
		
		
	}

}
