package thread_quiz;

public class Quiz01 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ThreadImplements a1 = new ThreadImplements("어흥");
		ThreadImplements a2 = new ThreadImplements("음메");
		ThreadImplements a3 = new ThreadImplements("히이이이이잉");
		
		
		Thread a11 = new Thread(a1);
		Thread a22 = new Thread(a2);
		Thread a33 = new Thread(a3);
		
		a11.start();
		a22.start();
		a11.join();
		a22.join();
		a33.start();
		
		
		
		
	}

}
