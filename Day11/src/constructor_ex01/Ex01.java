package constructor_ex01;


public class Ex01 {

	public static void main(String[] args) {
		Person person = new Person("±è±âÈÆ", "19910121", "³²ÀÚ");
//		person.name = "±è±âÈÆ";
//		person.sex = "³²ÀÚ";
//		person.year = "19910121";
//		person.selfYear();
//		person.hi();s
//		person.walk();
//		person.selfInFo();	
			
		
		person.setName("¼ÕÈï¹Î");
		person.setSex("³²ÀÚ");
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
