package array_quiz;

public class Quiz01 {

	public static void main(String[] args) {
				
		
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};


        // 1�� �迭�� 4��° ���� 6���� �ٲټ���.
        numbers[3] = 6;
       

        //2�� �迭�� ���� ������� ����ϼ���.
//         for ( int i = 0; i<numbers.length; i++) {
//             System.out.println(numbers[i]);
//         }
       

        //3�� �迭�� ���� �������� ����ϼ���.
//         int i;
//         for ( i = numbers.length-1; 0<=i; i--) {
//             System.out.print(numbers[i]+ " ");
//         }
       

        //4�� �迭�� ¦����° ��ġ�� �ִ� ������ ����ϼ���.

//         for ( int j = 0; j<numbers.length; j++) {
//             if ( j % 2 != 0) {
//                 System.out.print(numbers[j] + " ");
//             }
//         }
        
        
        // 4�� -1 �ݺ��� �� ������ 2���� �����
//        for ( int j = 1; j<numbers.length; j += 2) {
//        	System.out.print(numbers[j] + " ");
//        }


        // 5�� �迭�� �� �� 2�� ��� �ִ� index�� ����ϼ���.
//         for ( int i = 1; i<numbers.length; i++) {
//             if ( numbers[i] == 2) {
//                 System.out.println("2�� ����ִ� index�� " + i);
//             }
//         }



        // 6�� �迭�� �� �� ���� ū ���� ����ϼ���.
       
//         int max = numbers[0];
//         for ( int i = 1; i<numbers.length; i++) {
//             if (numbers[i] > max) {
//                 max = numbers[i];
//             }
//           
//         }
//         System.out.println("���� ū ���� " + max);



        // 7�� �迭�� �� �� ���� ���� ���� ����� index�� ����ϼ���.

//         int min = numbers[0];
//         int minindex = 0;
//         for ( int i = 1; i<numbers.length; i++) {
//             if (numbers[i] < min) {
//                 min = numbers[i];
//                 minindex = i;
//               
//             }
//           
//         }
//         System.out.println("�ּҰ��� �ε����� " + minindex);


        //8�� �迭�� ��� ���� ����� ����ϼ���.
       
        double sum = 0;

        for ( int i = 0; i<numbers.length; i++) {
                sum  += numbers[i];
        }

        System.out.println("����� " + sum/numbers.length);
       
	}

}
