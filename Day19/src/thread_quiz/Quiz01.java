package thread_quiz;

public class Quiz01 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		ThreadImplements a1 = new ThreadImplements("����");
		ThreadImplements a2 = new ThreadImplements("����");
		ThreadImplements a3 = new ThreadImplements("������������");
		
		
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
