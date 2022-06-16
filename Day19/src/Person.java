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
		return "�̸�: " + this.name + ", �������:" + this.year;
	}
	
	
	
	
	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		List<Person> list = new ArrayList<>();
		
		
		while (true) {
		System.out.print("1:�Է� 2:��� 3:���� 4:����");
		int haha = scan.nextInt();
		
		
			if (haha == 1 ) {
				System.out.print("�̸��� �Է��ϼ���: ");
				String anwser = scan.next();
				System.out.print("��������� �Է��ϼ���: ");
				int anwser1 = scan.nextInt();
				Person person = new Person(anwser, anwser1);
				list.add(person);
			
			} else if ( haha == 2) {
				
//				if ( list.isEmpty() == true) {
//					System.out.println("��� �ֽ��ϴ�.");
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
					System.out.println(p);   // tostring ���Ǹ� �������̵� �ϸ�ȴ�. �׷��� �ּҰ� �ȳ��´�.
				}
			
			
			} else if (haha == 3) {
				
				System.out.print("������ ����� �Է��ϼ��� :");
				String anwser2 = scan.next();
				
				Iterator <Person> list2 = list.iterator();
				while(list2.hasNext()) {
				
					Person person = list2.next();
					if (person.getName().equals(anwser2)) {
						list2.remove();
						System.out.println("���� �Ǿ����ϴ�.");
					}
					
				}
				
				
				
				
				
				
			
			} else if (haha == 4) {
				System.out.println("���� �մϴ�.");
				break;
			
			} else {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}
		
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
