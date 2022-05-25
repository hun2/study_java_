package variable_ex;

public class Ex02 {

	public static void main(String[] args) {
		
		double pi = 3.14;
		int intpi = (int)pi;
		System.out.println(intpi);
		
		System.out.println((double)intpi); // 소수점있이 출력



		int number = 7;
		double result =  number / 2 ;   // int / int 값으로 먼저 계산되기때문에 3.5 로 출력된다.
																		//저장값 형을 double 으로 했기때문에 3.5에서 소수점 버림.

		System.out.println(result); // 소수점 있이 3.0 출력됨.

		// 둘 중 하나의 값을 실수로 형변환 하거나
		result =  (double)number / 2 ;

		//실수로 나누거나

		result =  number / 2.0 ;


		//반올림 하는법
		double haha = 3.14129011023013213213;
		Math.round(haha);
		System.out.println(Math.round(haha));
		
		
		
		
		
		
		
		
		
		
	}

}
