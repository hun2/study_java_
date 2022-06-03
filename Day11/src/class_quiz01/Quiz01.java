package class_quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		Student student =  new Student();
		Student studentLee= new Student();
		student.name = "유재석";
		student.age = 21;
		student.subject = "java";
		student.number = "01023453223";
		
		
		
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student.subject);
		System.out.println(student.number);
		student.isAdult();
		
		
		
		
		studentLee.name = "이효리";
		studentLee.age = 17;
		studentLee.subject = "java";
		studentLee.number = "01096482734";
		
		
		System.out.println(studentLee.name);
		System.out.println(studentLee.age);
		System.out.println(studentLee.subject);
		System.out.println(studentLee.number);
		studentLee.isAdult();
		
		
	}

}
