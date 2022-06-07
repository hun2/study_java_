package constructor_quiz01;

public class Rectangle {

	private int row;

	private int column;

	

	

	

	public Rectangle(int row, int column) {

		

		this.row = row;

		this.column = column;

		

		System.out.println("가로 "+ row+ "cm, 세로 "+ column+ "cm 사각형이 만들어졌습니다.");

	

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
