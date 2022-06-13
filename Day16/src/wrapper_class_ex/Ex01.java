package wrapper_class_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		
		int n1 = 5;
		System.out.println(n1);
		
		
		// Wrapper 클래스에 값 저장하기.
		Integer n2 = 5;
		System.out.println(n2);
		
				
		// Wrapper 클래스에 값 저장하기.
		Integer n3 = new Integer(5); // deprecated 됬다 라고 표현을 한다. -> 앞으로 없어질거임.
		System.out.println(n3);
		
		
		Integer n4 = 5;
		
		System.out.println(n1 == n2); // true 값 비교 (한쪽이 int 이므로 값을 무조건 비교대상으로 됨)
		System.out.println(n1 == n3); // true 값 비교 (한쪽이 int 이므로 값을 무조건 비교대상으로 됨)
		System.out.println(n2 == n3); // false 주소 비교를 했기때문에 
		System.out.println(n2 == n4); // true 주소비교를 했는데 공간이 같음.
		
		
		System.out.println(n2.equals(n3));
		
	}

}
