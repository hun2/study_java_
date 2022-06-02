package string_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// int , cahr , double , float , long ... => 기본 자료형(Primitive Type)
		// String 변수에 값 저장하기
		
		String a = "하이요";
		String b = new String ("하이요");  // new 로 생성될때 객체라고 불린다.
		String c = new String ("하이요");
		String d = "하이요";
		
		
		
		//String 끼리 값 비교하기 ==는 stack 영역의 주소값을 비교하는것.
		System.out.println(a == b); // 같은 타입만 true 가 나온다. (메모리 구조로 인하여) // 주소비교
		System.out.println(c == d); // 같은 타입만 true 가 나온다. (메모리 구조로 인하여) // 주소비교
		 
		System.out.println(a==d); // 같은 타입이기에 true 가 나온다. // 주소비교
		System.out.println(b==c); //  같은 타입이여도 메모리 구조가 다르기때문에 heap 메모리구조. //주소비교
		
		
		//String 끼리 값 비교하기위해서는 반드시 equals 를써야한다.
		System.out.println(a.equals(b));
		
		
		
	}

}
