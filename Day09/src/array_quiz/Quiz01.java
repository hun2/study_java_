package array_quiz;

public class Quiz01 {

	public static void main(String[] args) {
				
		
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};


        // 1번 배열의 4번째 값을 6으로 바꾸세요.
        numbers[3] = 6;
       

        //2번 배열의 값을 순서대로 출력하세요.
//         for ( int i = 0; i<numbers.length; i++) {
//             System.out.println(numbers[i]);
//         }
       

        //3번 배열의 값을 역순으로 출력하세요.
//         int i;
//         for ( i = numbers.length-1; 0<=i; i--) {
//             System.out.print(numbers[i]+ " ");
//         }
       

        //4번 배열의 짝수번째 위치에 있는 값들을 출력하세요.

//         for ( int j = 0; j<numbers.length; j++) {
//             if ( j % 2 != 0) {
//                 System.out.print(numbers[j] + " ");
//             }
//         }
        
        
        // 4번 -1 반복문 덜 돌리는 2증감 연산법
//        for ( int j = 1; j<numbers.length; j += 2) {
//        	System.out.print(numbers[j] + " ");
//        }


        // 5번 배열의 값 중 2가 들어 있는 index를 출력하세요.
//         for ( int i = 1; i<numbers.length; i++) {
//             if ( numbers[i] == 2) {
//                 System.out.println("2가 들어있는 index는 " + i);
//             }
//         }



        // 6번 배열의 값 중 가장 큰 값을 출력하세요.
       
//         int max = numbers[0];
//         for ( int i = 1; i<numbers.length; i++) {
//             if (numbers[i] > max) {
//                 max = numbers[i];
//             }
//           
//         }
//         System.out.println("가장 큰 값은 " + max);



        // 7번 배열의 값 중 가장 작은 수가 저장된 index를 출력하세요.

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
//         System.out.println("최소값의 인덱스는 " + minindex);


        //8번 배열의 모든 수의 평균을 출력하세요.
       
        double sum = 0;

        for ( int i = 0; i<numbers.length; i++) {
                sum  += numbers[i];
        }

        System.out.println("평균은 " + sum/numbers.length);
       
	}

}
