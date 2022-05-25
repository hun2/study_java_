package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 안녕 세번 출력
//		System.out.println("안녕");
//		System.out.println("안녕");
//		System.out.println("안녕");
		
		// 반복문 쓰고 세번 출력
//		int i = 3;
//		while ( i <= 5) {
//			System.out.println("안녕" + i);
//			i ++;
//		}
		
		//0 부터 4까지
//		int i = 0;
//		while ( i <5 ) {
//			System.out.println("i값이 어떻게 변해 가는가 ? "  + i );
//			i++;
//		}
		
		//1부터 5까지
//		int i = 1;
//		while ( i <= 5) {
//			System.out.println("i값이 어떻게 변해 가는가 ?" + i);
//			i++;
//		}
//		
		// 5에서 0까지
//		int i = 5;
//		while (  i  >= 0) {
//			System.out.println("i값이 어떻게 변해 가는가 ?"+ i); 
//			i--;
//		}
		
		
		// 0부터 10까지 총합
		int sum = 0 ;
		int i = 1;
		while ( i <= 10 ) {
			
			sum += i;
			i++;
			
		} 
		System.out.println(sum);
		
	}

}
