package constuctor_quiz03;

public class Product {

	private String name;
	private int cost;
	private String day;
	
	public Product (String name, int cost, String day) {
		this.name = name;
		this.cost = cost;
		this.day =day;
		
		System.out.println("�̸� :" + name);
		System.out.println("���� :" + cost );
		System.out.println("������� : "+ day);
	}
	
	
	public void cost(int a ) {
		System.out.println("��ǰ " + a + "���� ���� : " + (this.cost * a) );
	}
	
	public void sell() {
		
		this.day = day.replace("-", "");
		int day  = Integer.valueOf(this.day);
		if ( day >= 20221231) {
			System.out.println("�ǸŰ��ɻ�ǰ");
		}
		else {
			System.out.println("�ǸźҰ���ǰ");
		}

		
		
	}
	
}
