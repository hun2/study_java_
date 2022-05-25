package loop_ex;

public class Ex02 {

	public static void main(String[] args) {
		
		
		// do - while 문 근데 왜 while 문 안에도 출력이 되나?
//		int i = 0;
//		
//		do {
//			System.out.println("한번은 실행된다");
//		}
//		
//		while( i > 1); {
//			System.out.println("이건 실행될까?");
//		}
//		
		
		
		// for 문
//		int i = 0;
//		for ( i = 0; i < 5 ; i++) {
//			System.out.println("안녕하세요");
//		}
//		
		
//		int i = 5;
//		for ( i = 5; i>=1; i--) {
//			System.out.println("안녕");
//		}
		
		
		int i = 1;
		int j = 0;
		for( i = 1; i<=100; i++) {
			j += i;
			
		}
		System.out.println(j);
		
		
		
//		int i = 1;
//		int j = 0;
//		for( i = 1; i<=100; i++) {
//			if ( i % 2 ==0 ) {
//				j += i;
//			}
//			else continue;
//		}
//		System.out.println(j);
//		
	}

}
