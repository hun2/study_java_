package nested_loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// ��ø �ݺ��� : �ݺ��� �ȿ� �ݺ���
//		for ( int i =1; i<= 10; i++) {
//			System.out.println("����Ʈ" + i + "ȸ" );
//		}
		
		//����Ʈ 3��Ʈ 10ȸ��
//		for (int i = 1; i<=3; i++) {
//			for( int j = 1; j<=10; j++) {
//				System.out.println("����Ʈ" + j+ "ȸ");
//			}
//			System.out.println("����Ʈ " + i + "��Ʈ°");
//		}
		
		
		
		for ( int i = 0; i < 5; i ++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
