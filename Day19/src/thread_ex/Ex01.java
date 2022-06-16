package thread_ex;

public class Ex01 {
	
	
	//메인 쓰레드
	public static void main(String[] args) throws InterruptedException {
		
		
		//쓰레드 만들기 1 : Thread 클래스를 상속 받아서 사용한다.
		//단점: 자바는 단일 상속으므로 쓰레드를 상속받으면 다른클래스를 함께 상속 받을 수 없다.
		
		
		//두번째 쓰레드
		ThreadExtends te1 = new ThreadExtends("*");
		
		
		//세번째 쓰레드
		ThreadExtends te2 = new ThreadExtends("@");
		
		
		//순차적 수행 싱글 쓰레드 코드
//		te1.run();
//		te2.run();
		
		
//		//멀티 쓰레드 수행 방법  start를 써야함.
//		te1.start();
//		te2.start();
		
		
		
		//쓰레기드 만들기 2. Runnable 인터페이스를 구현해서 사용한다.
		// 다중상속 가능.
		
		ThreadImplements t1 = new ThreadImplements("*");
		ThreadImplements t2 = new ThreadImplements("@");
		
		//순차석 수행 싱글 쓰레드 코드
//		t1.run();
//		t2.run();
		
		
		//쓰레드안에 넣어주고 재정의
		Thread t11 = new Thread(t1);
		Thread t22 = new Thread(t2);
		
		
		t11.start();
		t11.join();  // t11 이라는 쓰레드가 끝날 때까지 메인쓰레드가 기다렸다.
		t22.start();
		t22.join();
		
		
		System.out.println("실행 완료(메인 쓰레드의 끝)");
		
		
	}

}
