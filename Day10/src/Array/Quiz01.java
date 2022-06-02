package Array;

public class Quiz01 {

	public static void main(String[] args) {
		
           int[][] scores = {{89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
		                 {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
		                 {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
		                 {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
		                 {45, 50, 48, 63, 67, 58, 40, 66, 47, 64} };

           
           
       //2차원배열_ 1번 각 학생의 평균을 각각 구해서 출력하세요.

           for ( int i =0; i<scores.length; i++) {
               int sum = 0;
               for (int j = 0; j<scores[i].length; j++) {
               sum += scores[i][j];
               }
               System.out.println(i+1  + "번째 학생의 평균은 " + (double)sum/10 );

            }
           
           
        //  2차원배열 _ 2번 학생별 최고점 구하기
            for ( int i =0; i<scores.length; i++) {
                int max = scores[i][0];
                for (int j = 1; j<scores[i].length; j++) {
                if ( max < scores[i][j] ) {
	                 max = scores[i][j];}
                }
                System.out.println(i+1  + "번째 학생의 최고점은 " + max );
            }
            
            
        //2차원배열_ 3번 평균이 가장 높은 학생의 평균점수와 몇 번째 학생인지 출력하세요.
            double maxAverage = 0;
            int numberMax = 0;
            for (int i = 0; i < scores.length; i++) {
	              int sum = 0;
              for (int j = 0; j < scores[i].length; j++) {
                   sum += scores[i][j];
                }
              double average = (double)sum / scores[i].length;
               if (maxAverage < average) {
                   maxAverage = average;
                   numberMax = i +1; }
		     }
             System.out.println("평균이 가장 높은 학생은 " + numberMax+ "번째 학생이고," + "평균 점수는 " + maxAverage );

             
             
            //2차원배열_4번 4번째 과목의 최고 성적의 학생이 몇 번째 학생인지와 점수를 출력하세요.
             
             int max = 0;
             int number = 0;
             for ( int i =0; i< scores.length; i++) {
            	 int max1 =0; 
            	 for (int j =0 ; j< scores[i].length; j++ ) {
            		 max1 = scores[i][3];
            	 }
            	 if ( max < max1) {
            		 max = max1;
            		 number = i+1;
            	 }
             }
             System.out.println("4번째 과목의 최고 성적자는 " + number + "째 학생이고, 점수는 " + max );

		             //2차원배열_5번 시험과목 index 3~7 의 평균이 가장 높은 학생의 index를 구하여 출력하세요.

             double maxAverage5 = 0;
             int numberMax5 = 0;
             for ( int i = 0; i < scores.length; i++) {
            	 	int sum = 0;
            	 	for (int j = 3;  j <= 7;  j++) {
            	 		sum += scores[i][j];
            	 	}
            	 	double average = (double)sum / 5;
            	 	if (maxAverage5 < average) {
            	 		maxAverage5 = average;
            	 		numberMax5 = i +1;
            	 	}

             }
             System.out.println("3~7 과목 평균이 가장 높은 학생은 " + numberMax5 + "번째 학생이고, 평균은 " + maxAverage5 + "입니다.");

		            

		             

		             

		             

		             

		             

		             

		             

		             

		             

		             

		             

		             

		             

		 

		           // 배열 고급문제 1번 위치 변경 (swap) - 두 개의 index를 입력 받아서, 해당하는 index의 값을 서로 교체 해서 배열을 출력하세요.

		 

		           

//		         int[] numbers = {3, 5, 2, 10, 39};

//		         Scanner scan = new Scanner(System.in);

//		         System.out.print("두 개의 index 를 입력하세요 :");     

//		         int a = scan.nextInt();

//		         int b = scan.nextInt();

//		         int c = 0;

//		         c = numbers[a];

//		         numbers[a] = numbers[b];

//		         numbers[b] = c;

		 

//		         for (int i = 0; i < numbers.length; i++) {

//		             System.out.print(numbers[i] + " ");

//		         }

		 

		           

		             //고급문제 2번 배열 순서 변경 1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤섞어서 그 결과를 출력하세요.

		 

//		         Random rand = new Random();

//		         int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};

		 

//		         for ( int i = 0; i < 10; i++) {

//		             int randIndex = rand.nextInt(10);

//		             numbers[0] = randIndex;

//		             System.out.print(numbers[0] + " ");

		 

//		         }

		          

		            

		             //고급문제 3번 빈도수 구하기. 1 ~ 5 범위 안에 숫자가 배열에 중복되어 저장되어있다. 1 ~ 5 까지의 숫자가 각각 몇 개씩 저장되어 있는지 출력하세요.

		          

		             int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};

		          

		             int a = 0;

		             int b = 0;

		             int c = 0;

		             int d = 0;

		             int e = 0;

		            

		             for ( int i = 0; i <numbers3.length; i++) {

		               

		                if ( numbers3[i] == 1) {

		                      a++;

		                }

		                if ( numbers3[i] == 2) {

		                      b++;

		                }

		                if ( numbers3[i] == 3) {

		                      c++;

		                }

		                if ( numbers3[i] == 4) {

		                      d++;

		                }

		                if ( numbers3[i] == 5) {

		                      e++;

		                }

		             }

		                        

		             System.out.println("1 : " + a + "개");

		             System.out.println("2 : " + b + "개" );

		             System.out.println("3 : " + c + "개");

		             System.out.println("4 : " + d + "개" );

		             System.out.println("5 : " + e + "개");

		     }

		 


}

