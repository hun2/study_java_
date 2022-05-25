package condition_ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("¸ö¹«°Ô¸¦ ÀÔ·ÂÇÏ¼¼¿ä :");
		int weight  =  scan.nextInt();
		if ( weight <= 70) {
			System.out.println("Ä¡Å²À» ¸Ôµµ·Ï ÇÏ¿©¶ó");
		}
		else if ( weight <=80 ){
			System.out.println("»ø·¯µå¸¦ ¸Ô¾î¶ó");
		}
		
		else if ( weight <= 90) {
			System.out.println("´ß°¡½¿»ì ¸Ô¾î¶ó");
		}
		
		else { System.out.println("³ë´ä");
		}
		
		
	}

}
