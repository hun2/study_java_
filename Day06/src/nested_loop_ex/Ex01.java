package nested_loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 중첩 반복문 : 반복문 안에 반복문
//		for ( int i =1; i<= 10; i++) {
//			System.out.println("스쿼트" + i + "회" );
//		}
		
		//스쿼트 3세트 10회씩
//		for (int i = 1; i<=3; i++) {
//			for( int j = 1; j<=10; j++) {
//				System.out.println("스쿼트" + j+ "회");
//			}
//			System.out.println("스쿼트 " + i + "세트째");
//		}
		
		
		
		for ( int i = 0; i < 5; i ++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
