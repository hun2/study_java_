package string_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		// 1�� ���� . ���ڿ�

        Scanner scan = new Scanner(System.in);

//         System.out.print("ID�� �Է��ϼ��� :");
//         String a = scan.next();
//
//         System.out.println("welcome! " + a);

          



        // 2������. ���� �ܾ �Է� �ް� 'e' �� �� �� ��� �ִ��� ��� �ϼ���.

      



//         System.out.print("�ܾ �Է��ϼ��� :");
//         String b = scan.next();
//         int count = 0;
//
//         for ( int i =0; i<b.length(); i++) {
//              if (b.charAt(i) ==  b.charAt(0)) {
//                  count++;
//                }
//         }
//
//         System.out.println("e�� ������ "+ count + "�� �Դϴ�.");









        //���ڿ� ��޹��� 1��_�����̸��� ����� ���ڿ� �迭���� jpg ������ ����� ����ϼ���.



//      String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//      int count = 0;

//      for ( int i = 0; i < files.length; i++) {
//          if (files[i].endsWith(".jpg")) {
//              count++;
//          }

//      }


//      System.out.println("jpg ���� ���� : " + count);



        //���ڿ� ��޹���2��_ ���� �ܾ� ��� ����. �Ʒ��� ���� 4���� ������ �����ϰ�, ���ڿ��� �������� �Է��� �޴´�. 100�� ���� �������� �������� ����Ѵ�.
        

//      System.out.print("1. �¸��� ����� �Է��ϼ��� : ");
//      String a = scan.next();
//      System.out.print("2. ����� ����� �Է��ϼ��� : ");
//      String b = scan.next();
//      System.out.print("3. ��ǻ�͸� ����� �Է��ϼ��� : ");
//      String c = scan.next();
//      System.out.print("4. ��Ʈ���� ����� �Է��ϼ��� : ");
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

//      System.out.println("������ " + num+"�� �Դϴ�.");


        //���ڿ� ��޹���3��_ �������� �� ���ϱ�

        String memberStr = "������:�۰�ȣ:���켺:�̹���:�۰�ȣ:�̹���:�̹���:������:�̺���:������";

       

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
