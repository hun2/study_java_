package array;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 배열의 값을 넣는다 = 초기화
		
		int[] score = new int[7];
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		score[5] = 6;
		score[6] = 7;
		
		
		
//		System.out.println("첫번째 값 " + score[0]);
//		System.out.println("두번째 값 " + score[1]);
//		System.out.println("세번째 값 " + score[2]);
//		System.out.println("네번째 값 " + score[3]);
//		System.out.println("다섯번째 값 " + score[4]);
//		System.out.println("여섯번째 값 " + score[5]);
//		System.out.println("일곱번째 값 " + score[6]);
		
		
		
		
		int [] scores = {90, 89, 71, 81};
		
		
		
		
		//배열의 값 변경
//		score [0] = 100;
//		System.out.println(score[0]);
		
		
		
		
		//반복문을 이용한 배열 값 출력
//		for ( int i = 0; i< score.length; i++) {
//			System.out.println(score[i]);
//		}
		
		
		
		//합계 구하기
		int sum = 0;
		for (int i =0; i<score.length; i ++ ) {
			sum += score[i];
			
		}
		System.out.println(sum);
	}

}
