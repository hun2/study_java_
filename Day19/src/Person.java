import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Person {
	
	
	public Person() {
		
	}
	
	private String name;
	private int year;
	
	public Person(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}


	public int getYear() {
		return year;
	}

	public void personResult() {
		System.out.println(this.name + this.year);
	}
	
	
	@Override
	public String toString () {
		return "이름: " + this.name + ", 생년월일:" + this.year;
	}
	
	
	
	
	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		List<Person> list = new ArrayList<>();
		
		
		while (true) {
		System.out.print("1:입력 2:출력 3:삭제 4:종료");
		int haha = scan.nextInt();
		
		
			if (haha == 1 ) {
				System.out.print("이름을 입력하세요: ");
				String anwser = scan.next();
				System.out.print("생년월일을 입력하세요: ");
				int anwser1 = scan.nextInt();
				Person person = new Person(anwser, anwser1);
				list.add(person);
			
			} else if ( haha == 2) {
				
//				if ( list.isEmpty() == true) {
//					System.out.println("비어 있습니다.");
//				
//				for (int i =0; i<list.size(); i++) {
//						list.get(i).personResult();
//				}
//					
//					
//				}
				
				
				
				Iterator<Person> iter = list.iterator();
				while(iter.hasNext()) {
					Person p = iter.next();
					System.out.println(p);   // tostring 정의를 오버라이드 하면된다. 그러면 주소값 안나온다.
				}
			
			
			} else if (haha == 3) {
				
				System.out.print("삭제할 사람을 입력하세요 :");
				String anwser2 = scan.next();
				
				Iterator <Person> list2 = list.iterator();
				while(list2.hasNext()) {
				
					Person person = list2.next();
					if (person.getName().equals(anwser2)) {
						list2.remove();
						System.out.println("삭제 되었습니다.");
					}
					
				}
				
				
				
				
				
				
			
			} else if (haha == 4) {
				System.out.println("종료 합니다.");
				break;
			
			} else {
				System.out.println("잘못 입력 하셨습니다.");
			}
		
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
