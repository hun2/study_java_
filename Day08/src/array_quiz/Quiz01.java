package array_quiz;

public class Quiz01 {

	public static void main(String[] args) {
			
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		
		//���� 1��. �迭�� 4��° ���� 6���� �ٲټ���.
		
		numbers[3] = 6;
		
		
		//���� 2. �迭�� ���� ������� ����ϼ���.

//		for ( int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//		
		
		
//		//���� 3��. �迭�� ���� �ݴ� ����(����)�� ����ϼ���.
//		for ( int i = 7; i<numbers.length; i--) {
//			System.out.println(numbers[i]);
//		}
		
		
//		//���� 4��. �迭�� ¦����° ��ġ�� �ִ� ������ ����ϼ���.
//		for ( int i = 2; i<numbers.length; i*2) {
//			System.out.println(numbers[i]);
//		}
		
		//���� 5�� . �迭�� �� �� 2�� ��� �ִ� index�� ����ϼ���.
		
//		for ( int i = 1; i<numbers.length; i++) {
//			if ( numbers[i] == 2) {
//				System.out.print("2�� ��� �ִ� index�� " + i);
//			}
//		}
		
		// ���� 6��. �迭�� �� �� ���� ū ���� ����ϼ���.
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
