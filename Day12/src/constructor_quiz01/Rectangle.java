package constructor_quiz01;

public class Rectangle {

	private int row;

	private int column;

	

	

	

	public Rectangle(int row, int column) {

		

		this.row = row;

		this.column = column;

		

		System.out.println("���� "+ row+ "cm, ���� "+ column+ "cm �簢���� ����������ϴ�.");

	

	}

 

 

	public int width () {

		

		int a = (this.row * this.column);	

		return a;

	}

	

	public int round () { 

		 int b = (this.row * 2) + (this.column * 2);

		 return b;

	 }

 

	
}
