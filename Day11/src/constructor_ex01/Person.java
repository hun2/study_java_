package constructor_ex01;

public class Person {

		private String name;
		private String year;
		private String sex;
		
		
		
		//�޼ҵ�
		//������ : ��ü�� �����ɶ� �ҷ����� Ư���� �޼ҵ�
		public Person() {
			System.out.println("�����־�");
		}
		
		//������ �����ε�
		public Person(String name, String year, String sex) {
			this.name = name;
			this.year = year;
			this.sex = sex;
			System.out.println("�Ķ���Ͱ� �������� ������ ");
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
			System.out.println("�λ縦 �Ѵ�");
		}
		
		void walk() {
			System.out.println("�ȴ´�");
		}
		
		void selfInFo() {
			System.out.println("�� �̸��� " + name + "�̰� ������ " + sex + "�̴�.");
		}
		
		void selfYear() {
			year = this.year.substring(0,4);
			int a = Integer.valueOf(year);
			
			System.out.println("���̴� " + (2022 - a+1)   + "�̴�.");
			
		}

	

}
