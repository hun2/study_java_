package map_quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Quiz03 {
	
	
	// final : 한번만 초기화 하도록 설정하는 것. 추후에 초기화가 절대 되지 않는다. 대신 메소드는 사용가능 ( ex , put이라던지 add라던지 등등)
	// 1. 변수에 붙이면 한번 초기화 된 변수에 값을 재할당 불가 => final int a = 100;  a= 50(불가)
	// 2. 메소드 앞에 붙이면 오버라이드 불가. ( 상속관계에서도)
	// 3. 클래스 앞에 붙이면 상속이 불가. 
	public static final Map<String, String> capitalMap = new HashMap<String, String>() {
        {
            put("대한민국", "서울");
            put("덴마크", "코펜하겐");
            put("독일", "베를린");
            put("러시아", "모스크바");
            put("벨기에", "브뤼셀");
            put("브라질", "브라질리아");
            put("스웨덴", "스톡홀름");
            put("스위스", "베른");
            put("스페인", "마드리드");
            put("아르헨티나", "부에노스아이레스");
            put("이집트", "카이로");
            put("이란", "테헤란");
            put("이탈리아", "로마");
            put("일본", "도쿄");
            put("필리핀", "마닐라");
            put("핀란드", "헬싱키");
            put("프랑스", "파리");
            put("터키", "앙카라");
            put("캐나다", "오타와");
            put("콜롬비아", "보고타");
        }
    };
	
	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner(System.in);
	     Random rand = new Random();

	     Set<String> keys = capitalMap.keySet(); // set은 인덱스가 없기때문에 list로 재정의 해야함.
	     List<String> keyList = new ArrayList<>(keys); // list는 인덱스가 있기에 재정의.
	     
	     List<Integer> quizIndex = new ArrayList<>();
	     
	     
	     int score = 0;
	     for ( int i = 0; i < 5 ; i++) {
	    	 
	    	// 숫자는 20문제. 0 ~19번까지 인덱스 사용.
		     int randIndex = rand.nextInt(20); // 0~19까지 인덱스 사용방법 또는 rand.nextInt(keyList.size()); 가능.
		     
		     //번호 중복검사
		     if (quizIndex.contains(randIndex)) {
		    	i--; // 중복이면 다시돈다. 
		    	continue;
		     }
		     
		     quizIndex.add(randIndex);
		     
		     
		     String country = keyList.get(randIndex);
		     System.out.print(country + "의 수도 이름은? ");
		     String answer = scan.next();
		     
		     if (answer.equals(capitalMap.get(country))) {
		    	 
		    	System.out.println("정답");
		    	score += 20;
		     } else {
		    	 System.out.println("오답");
		     }
		     
		     
	     }
	     
	     
	     
	     
	     
	}

}
