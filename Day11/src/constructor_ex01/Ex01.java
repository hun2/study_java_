package constructor_ex01;


public class Ex01 {

	public static void main(String[] args) {
		Person person = new Person("�����", "19910121", "����");
//		person.name = "�����";
//		person.sex = "����";
//		person.year = "19910121";
//		person.selfYear();
//		person.hi();s
//		person.walk();
//		person.selfInFo();	
			
		
		person.setName("�����");
		person.setSex("����");
		person.setYear("19900121");
		
		System.out.println(person.getName());
		System.out.println(person.getSex());
		System.out.println(person.getYear());
		
		person.selfInFo();
		person.hi();
		person.walk();
		person.selfYear();
		
	}

}
