package map_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		List <String> fruits = new ArrayList<>();
		
		
		
		while (true) {
			System.out.println("1:입력 2:출력 3:삭제 4:종료");
			int number = scan.nextInt();
			if (number == 1) {
				// 입력
				System.out.print("과일 이름을 입력하세요 :");
				String answer = scan.next();
				
				
				//정식버전
//				if (fruits.add(answer)) {
//					System.out.println("입력 성공");
//				} else {
//					System.out.println("입력 실패");
//				}
				
				// 삼항연산자로도 표현가능.
				String result = fruits.add(answer) ? "입력성공": "입력실패";
				System.out.println(result);
				
				
				
				
			} else if (number == 2) {
				
				//출력
				for (int i =0; i < fruits.size(); i++) {
					System.out.println(fruits.get(i));
				}
				
				if (fruits.size() == 0) {
					System.out.println("비어 있습니다.");
				}
				
				
				
			} else if (number == 3) {
				//삭제
				System.out.print("삭제할 과일 이름을 입력하세요:");
				String deleteAnswer = scan.next();
				if (fruits.remove(deleteAnswer)) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				
				
				
				
				
			} else if (number == 4) {
				//종료
				
				System.out.println("종료합니다.");
				break;
				
				
			} else {
				//잘못입력
				System.out.println("잘못 입력 하셨습니다.");
				continue;
			}
		}
		
		
		
		
		
		
	}

}
