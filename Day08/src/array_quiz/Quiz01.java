package array_quiz;

public class Quiz01 {

	public static void main(String[] args) {
			
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		
		//문제 1번. 배열의 4번째 값을 6으로 바꾸세요.
		
		numbers[3] = 6;
		
		
		//문제 2. 배열의 값을 순서대로 출력하세요.

//		for ( int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//		
		
		
//		//문제 3번. 배열의 값의 반대 순서(역순)로 출력하세요.
//		for ( int i = 7; i<numbers.length; i--) {
//			System.out.println(numbers[i]);
//		}
		
		
//		//문제 4번. 배열의 짝수번째 위치에 있는 값들을 출력하세요.
//		for ( int i = 2; i<numbers.length; i*2) {
//			System.out.println(numbers[i]);
//		}
		
		//문제 5번 . 배열의 값 중 2가 들어 있는 index를 출력하세요.
		
//		for ( int i = 1; i<numbers.length; i++) {
//			if ( numbers[i] == 2) {
//				System.out.print("2가 들어 있는 index는 " + i);
//			}
//		}
		
		// 문제 6번. 배열의 값 중 가장 큰 값을 출력하세요.
		int max = numbers[0];
		for (int i = 0; i<numbers.length; i++) {
			
			
			if ( numbers[1] > numbers[0]) {
				max = numbers[1];
			} if (numbers[2] > numbers[0]) {
				max = numbers[2];
			} if (numbers[3] > numbers[0]) {
				max = numbers[3];
			} if ( numbers[4] > numbers[0]) {
				max = numbers[4];
			} if ( numbers[5] > numbers[0]) {
				max = numbers[5];
			} if ( numbers[6] > numbers[0]) {
				max = numbers[6];
			} if ( numbers[7] > numbers[0]) {
				max = numbers[7];
			}
			
		}
		
		
		
		
	}

}
