package variable_quiz;

public class Quiz_02 {

	public static void main(String[] args) {
		  // 시험 성적이 90점 이상이면 'A'학점이고 평점은 4.0 입니다.
		  // 시험 성적이 80점 이상이면 'B'학점이고 평점은 3.0 입니다.
		
		int grade = 95;
		
		
		if ( grade >= 80) {
			System.out.println("B학점이고 평점은 3.0 입니다.");
			
			
		}
		
		else if (grade >= 90) {
			System.out.println("A학점이고 평점은 4.0 입니다.");
			
		}
		
		int a = 90;
		char aaa= 'A';
		double aa = 4.0;
		
		int b = 80;
		char bbb = 'b';
		double bb = 3.0;
		
		System.out.println("시험성적이 " + a + "이상이면 '" + aaa + "'학점이고" + "평점은" + aa + "입니다.");
		System.out.println("시험성적이 " + b + "이상이면 '" + bbb + "'학점이고" + "평점은" + bb + "입니다.");
		
		
		//아래 정수와 실수를 곱해서 출력하세요
		int number1 = 33;
		double number2 = 35.325;
		double sum = number1*number2;
		
		System.out.println( " 두수의 곱은 : " + sum  );
		
		//943 시간은 몇일 몇시간 인지 구하여 출력하세요.
		
		int number3 = 943;
		int app = number3 / 24;
		int appp = number3%24;
		System.out.println(number3 + "시간은 " + app + "일 " + appp + "시간 입니다."	);
		
		
		//도형 넓이 구하기 가로 길이 8, 세로 길이 9인 사각형과 삼각형의 넓이를 각각 구하여 출력하세요.
		int z = 8;
		int p = 9;
		int zp = z*p;
		
		
		System.out.println("사각형의 넓이 : " + zp);
		System.out.println("삼각형의 넓이 : " + zp/2);
		
		
		
		
	}

}
