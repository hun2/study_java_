package constructor_ex01;

public class Person {

		private String name;
		private String year;
		private String sex;
		
		
		
		//메소드
		//생성자 : 객체가 생성될때 불려지는 특수한 메소드
		public Person() {
			System.out.println("ㅇ응애앵");
		}
		
		//생성자 오버로딩
		public Person(String name, String year, String sex) {
			this.name = name;
			this.year = year;
			this.sex = sex;
			System.out.println("파라미터가 여러개인 생성자 ");
		}
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		
		
		
		void hi () {
			System.out.println("인사를 한다");
		}
		
		void walk() {
			System.out.println("걷는다");
		}
		
		void selfInFo() {
			System.out.println("내 이름은 " + name + "이고 성별은 " + sex + "이다.");
		}
		
		void selfYear() {
			year = this.year.substring(0,4);
			int a = Integer.valueOf(year);
			
			System.out.println("나이는 " + (2022 - a+1)   + "이다.");
			
		}

	

}
