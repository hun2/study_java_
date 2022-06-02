package string_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		//연습문제 1번 아래 문자열에서 A 를 B로 바꿔서 출력 하세요.
		
		
		
		String gradeStr = "My grade is A";
		gradeStr = gradeStr.replace("A", "B");
		System.out.println(gradeStr);
		
		
		
		// 연습문제 2번 문자열 정수 변환 아래와 같이 생년월일이 저장된 String 이 있을때 올해 나이를 출력하세요. (한국나이)
		
		
		String birth = "19950721";
		birth = birth.substring(0, 4);
		
		
				
		int birth2 = Integer.valueOf(birth);
		System.out.println(2022 - birth2+1);
		
		//문자열 19950721을 1995로 바꾼후 숫자형으로 바꾼다 . 그리고 2022에서 뺀다.
//		String birth = "19950721";
//		birth = birth.replace("19950721", "1995");
//			
//		int birth2 = Integer.valueOf(birth);
//		System.out.println(2022 - birth2+1);
		
		
		
		//문자열 검색 아래 문자열의 단어 개수를 출력 하세요.(중복 포함)
		String sentence = "To be, or Not to Be. That Is The Question";
		
		String[] sentences = sentence.split(" ");
		
		int a = 0;
		for (int i =0; i < sentences.length; i++) {
			System.out.println(sentences[i]);
			a++;
		}
		
		System.out.println(a);
	}
	
	

}
