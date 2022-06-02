package string_ex;

public class Ex02 {

	public static void main(String[] args) {
		
		
		
		// 자료형을 변환 
		// 숫자 3에서 문자열 "3" 으로 변환 숫자 => 문자열
		
		// 추천하지 않는 방법
		int number1 = 3;
		String str1 = number1 +""; // 숫자 + 문자 => 문자
		System.out.println(str1);
		
		
		//정석 방법
		String str2 = String.valueOf(number1);
		System.out.println(str2);
	
		
		
		// 문자를 숫자로 변환 방법
		String str3 = "5";
		int number2 = Integer.parseInt(str3);
		System.out.println(number2);
		int number3 = Integer.valueOf(str3);
		System.out.println(number3);
		
		
		
		
		// 아래와 같이 생년이 저장된 String 이 있을때 올해 나이를 출력하세요.(한국나이)
		String birthday = "1995";
		int number4 = Integer.parseInt(birthday);
		System.out.println(2022 - number4 + 1 + "세");
		
			
	}
}
