package constructor_quiz04;


public class Omrcard {
	
	private String  name;
	private int number;
	private int[] answer;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
	public void hh(int a, int b , int c, int d, int e) {
		this.answer = new int[] {a,b,c,d,e};
	
		
	}
	
	
	
	
	
	
	
	
}
