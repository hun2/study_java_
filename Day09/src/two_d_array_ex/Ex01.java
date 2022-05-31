package two_d_array_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//2차원 배열 
		int [][] scores = { {10,11,12} , {50,51,52}, {71,72,73}, {91,92,93}, {100,101,120}};
		
		
		
		System.out.println("3번째 학생의 두번째 점수는?" + scores[2][1]);
		System.out.println("2번째 학생의 첫번째 점수는?" + scores[1][0]);
		System.out.println("5번째 학생의 세번째 점수는?" + scores[4][2]);
		System.out.println("====================================================================");
		
		//반복문으로 2차원 배열 값 출력
//		for (int i = 0; i < scores.length; i++) {
//			for ( int j = 0; j< scores[i].length; j++) {
//				System.out.println(scores[i][j]);
//			}
//		}
		
		
//		for (int i = 0; i < scores.length; i++) {
//			for ( int j = 0; j< scores[i].length; j++) {
//				System.out.println((i+1) + "번째 학생의 " + (j +1) + "번째 점수는" + scores[i][j] + "이다");
//			}
//		}
		
		
		
		//학생들의 평균 구하기.
		
		for ( int i = 0; i < scores.length; i++) { //학생 수만큼 도는거
			int sum = 0;
			for (int j = 0; j< scores[i].length; j++) {
				
				
				sum += scores[i][j];
				
				
				
			}
			double average = sum / (double)scores.length;
			System.out.println((i+1) + "번째 학생의 " + "평균 점수는" +average + " 이다");
		}
		
		
	}

}
