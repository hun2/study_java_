package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		int water =  900;
		System.out.println("물의 가격은 " + water +"원" + " 입니다.");
		
		int threewater = water * 3;
		System.out.println("물의 가격은 " + water +"원" + " 입니다." + "물의 세개 가격은" + threewater + "원" + "입니다.");
		
		int money = 10000;
		int change = money - threewater;
		System.out.println("거스름돈 :" + change);
		
		
		money = 5000;
		change = money/water;
		int ee = money % water;
		System.out.println("살 수 있는 갯수 " + change + " 개" + "입니다." );
		System.out.println("남은 돈은 " + ee + "원" + " 입니다.");
		
		
		
		
		// 		시험 성적이 90점 이상이면 'A'학점이고 평점은 4.0 입니다.
		 // 시험 성적이 80점 이상이면 'B'학점이고 평점은 3.0 입니다.
	}

}
