package variable_quiz;

public class Quiz02 {

	public static void main(String[] args) {
		int [] test  =  new int[] {1,3,5};
		for ( int i = 0 ; i< test.length; i++) {
			System.out.println(test[i]);
			
		}
		
		System.out.println("=============================절취선============================");
		
		
		
		int []test3 = new int[3];
		test3[0] = 1;
		test3[1] = 2;
		test3[2] = 3;
		System.out.println(test3[0]);
		System.out.println(test3[1]);
		System.out.println(test3[2]);
		

		
		System.out.println("=============================절취선============================");
		
		
		
		int[] test1 =  new int[5];
		test1[0] = 3;
		test1[1] = 4;
		test1[2] = 5;
		test1[3] = 6;
		test1[4] = 5;
		for(int i = 0; i< test.length; i++) {
			if ( i > 4) {
				break;
			}
			System.out.println(test1[i]);
		}
		
		
		
	}

	
	
}
