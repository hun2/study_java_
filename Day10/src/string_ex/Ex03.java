package string_ex;

public class Ex03 {

	public static void main(String[] args) {
		
		
		String st1 = "eclipse";
		
		// charAt : n번째에 무슨 글자가 있느냐 ? 쓸때 쓰는 메소드.
		
		
		System.out.println("charAt:" + st1.charAt(4));
		
				
		
		//contains : 특정 문자열이 문자열에 포함되어 있는지 확인
		
		System.out.println("contains :" + st1.contains("lip"));
		
		
		
		// startsWith : 특정 문자열로 시작하는지 확인
		
		System.out.println("statrsWith :" + st1.startsWith("ecl"));
		
		
		
		// endsWith : 특정 문자열로 끝나는 지 확인
		
		System.out.println("endWith :" + st1.endsWith("se"));
		
		
		// length : 문자열의 길이를 확인하는, 알파벳의 갯수
		
		System.out.println("length :" + st1.length() );
		
		
		// replace : 포함된 문자열 부분을 교체
		
		String st2 = "내가 지금 먹고 싶은 것은 치킨이다.";
		st2 = st2.replace("치킨", "족발"); // 꼭 저장해줘야 한다.
		System.out.println(st2);
			
		
		// split : 특정 스트링을 기준으로 잘라서 배열에 넣는다.
		
		String st3 = "apple,melon,grape";
		String[] fruits = st3.split(",");
		for ( int i = 0 ; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		
		
		// substring : 문자열을 자른다.
		String st4 = "javastudy";
		System.out.println("substring :" + st4.substring(4)); //인덱스 번호를 넣는다.
		
		
		// 앞자리를 짜를려면 인자값을 두개를 넘겨주는 방법으로 해야한다.
		System.out.println("substring :" + st4.substring(0, 4)); //인덱스 번호를 넣는다. 대신 마지막 인덱스 번호는 1을 더한다 생각해라.
		System.out.println("substring :"+ st4.substring(4, 9)); // 4부터 8까지지만 마지막번호는 1더 더해줘야 한다.
		
		
		
		
		
		
		
		
	}

}
