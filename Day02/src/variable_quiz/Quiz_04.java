package variable_quiz;

public class Quiz_04 {

	public static void main(String[] args) {
				
		
		
		int a  = 843;
		int b = 8;
		
		int aa = a/b;
		int ab = a%b;
		System.out.println("�� :" + aa + "������ :" + ab);
		
		System.out.println("===============1��================");
		
		int x = 6;
		int y = 4;
		
		System.out.println("X�� " + y + "�̰�," + "Y��" + x + "�Դϴ�.");
		

		System.out.println("===============2��================");
		
		
		int cho = 464;
		int min = cho/60;
		int mon = cho%60;
		System.out.println(min+ "��" + mon + "��");
		

		System.out.println("===============3��================");
		
		
		double h =  1234;
		System.out.println(Math.round(h)/1000);
		System.out.println(Math.round(h/100)%10);
		System.out.println(Math.round(h/10)%10);
		System.out.println(Math.round(h/1)%10);
		
		

		System.out.println("===============4��================");
		
		
		
		
		int num = 1234;
		int num1 = 0;
		
		while ( num!=0) {
			num1 += num%10;
			num /= 10;
			}
		
		System.out.println(num1);
		
		System.out.println("===============5��================");
		
		
		}
	
	
}