package string_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		// 1번 문제 . 문자열

        Scanner scan = new Scanner(System.in);

//         System.out.print("ID를 입력하세요 :");
//         String a = scan.next();
//
//         System.out.println("welcome! " + a);

          



        // 2번문제. 영어 단어를 입력 받고 'e' 가 몇 개 들어 있는지 출력 하세요.

      



//         System.out.print("단어를 입력하세요 :");
//         String b = scan.next();
//         int count = 0;
//
//         for ( int i =0; i<b.length(); i++) {
//              if (b.charAt(i) ==  b.charAt(0)) {
//                  count++;
//                }
//         }
//
//         System.out.println("e의 개수는 "+ count + "개 입니다.");









        //문자열 고급문제 1번_파일이름이 저장된 문자열 배열에서 jpg 파일이 몇개인지 출력하세요.



//      String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//      int count = 0;

//      for ( int i = 0; i < files.length; i++) {
//          if (files[i].endsWith(".jpg")) {
//              count++;
//          }

//      }


//      System.out.println("jpg 파일 개수 : " + count);



        //문자열 고급문제2번_ 영어 단어 퀴즈를 낸다. 아래와 같이 4개의 문제를 출제하고, 문자열로 차례차례 입력을 받는다. 100점 만점 기준으로 몇점인지 출력한다.
        

//      System.out.print("1. 승리를 영어로 입력하세요 : ");
//      String a = scan.next();
//      System.out.print("2. 사랑을 영어로 입력하세요 : ");
//      String b = scan.next();
//      System.out.print("3. 컴퓨터를 영어로 입력하세요 : ");
//      String c = scan.next();
//      System.out.print("4. 노트북을 영어로 입력하세요 : ");
//      String d = scan.next();
//      int num = 0;

//      if ( a.equals("victory")) {
//        num += 25;
//      }

//      if (b.equals("love")) {
//       num += 25;
//      }
//      if ( c.equals("computer")) {
//        num += 25;
//      }
//      if (d.equals("notebook")) {
//        num += 25;
//      }

//      System.out.println("점수는 " + num+"점 입니다.");


        //문자열 고급문제3번_ 동명이인 수 구하기

        String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";

       

        String[] str = memberStr.split(":");

        String[] str2 = new String[10];
        int count = 0;
       

        for ( int i = 0; i < str.length; i++) {

         

          for ( int j = i+1; j<str.length; j++) {

                if ( str[i].equals(str[j])) {

                      str2[i] = str[i];

                }

          }
          
          
          
          
          
          for (int i1 =0; i1<str2.length; i1++) {

              if ( str2[i1] != null) {

                    count ++;

              }

          }

        }
		
		
	}

}
