package Array;

public class Quiz01 {

	public static void main(String[] args) {
		
           int[][] scores = {{89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
		                 {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
		                 {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
		                 {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
		                 {45, 50, 48, 63, 67, 58, 40, 66, 47, 64} };

           
           
       //2�����迭_ 1�� �� �л��� ����� ���� ���ؼ� ����ϼ���.

           for ( int i =0; i<scores.length; i++) {
               int sum = 0;
               for (int j = 0; j<scores[i].length; j++) {
               sum += scores[i][j];
               }
               System.out.println(i+1  + "��° �л��� ����� " + (double)sum/10 );

            }
           
           
        //  2�����迭 _ 2�� �л��� �ְ��� ���ϱ�
            for ( int i =0; i<scores.length; i++) {
                int max = scores[i][0];
                for (int j = 1; j<scores[i].length; j++) {
                if ( max < scores[i][j] ) {
	                 max = scores[i][j];}
                }
                System.out.println(i+1  + "��° �л��� �ְ����� " + max );
            }
            
            
        //2�����迭_ 3�� ����� ���� ���� �л��� ��������� �� ��° �л����� ����ϼ���.
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
             System.out.println("����� ���� ���� �л��� " + numberMax+ "��° �л��̰�," + "��� ������ " + maxAverage );

             
             
            //2�����迭_4�� 4��° ������ �ְ� ������ �л��� �� ��° �л������� ������ ����ϼ���.
             
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
             System.out.println("4��° ������ �ְ� �����ڴ� " + number + "° �л��̰�, ������ " + max );

		             //2�����迭_5�� ������� index 3~7 �� ����� ���� ���� �л��� index�� ���Ͽ� ����ϼ���.

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
             System.out.println("3~7 ���� ����� ���� ���� �л��� " + numberMax5 + "��° �л��̰�, ����� " + maxAverage5 + "�Դϴ�.");

		            

		             

		             

		             

		             

		             

		             

		             

		             

		             

		             

		             

		             

		             

		 

		           // �迭 ��޹��� 1�� ��ġ ���� (swap) - �� ���� index�� �Է� �޾Ƽ�, �ش��ϴ� index�� ���� ���� ��ü �ؼ� �迭�� ����ϼ���.

		 

		           

//		         int[] numbers = {3, 5, 2, 10, 39};

//		         Scanner scan = new Scanner(System.in);

//		         System.out.print("�� ���� index �� �Է��ϼ��� :");     

//		         int a = scan.nextInt();

//		         int b = scan.nextInt();

//		         int c = 0;

//		         c = numbers[a];

//		         numbers[a] = numbers[b];

//		         numbers[b] = c;

		 

//		         for (int i = 0; i < numbers.length; i++) {

//		             System.out.print(numbers[i] + " ");

//		         }

		 

		           

		             //��޹��� 2�� �迭 ���� ���� 1 ~ 10 ���� ���ʷ� ����� �迭�� �����, ������ �ڼ�� �� ����� ����ϼ���.

		 

//		         Random rand = new Random();

//		         int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};

		 

//		         for ( int i = 0; i < 10; i++) {

//		             int randIndex = rand.nextInt(10);

//		             numbers[0] = randIndex;

//		             System.out.print(numbers[0] + " ");

		 

//		         }

		          

		            

		             //��޹��� 3�� �󵵼� ���ϱ�. 1 ~ 5 ���� �ȿ� ���ڰ� �迭�� �ߺ��Ǿ� ����Ǿ��ִ�. 1 ~ 5 ������ ���ڰ� ���� �� ���� ����Ǿ� �ִ��� ����ϼ���.

		          

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

		                        

		             System.out.println("1 : " + a + "��");

		             System.out.println("2 : " + b + "��" );

		             System.out.println("3 : " + c + "��");

		             System.out.println("4 : " + d + "��" );

		             System.out.println("5 : " + e + "��");

		     }

		 


}

