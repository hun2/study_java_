package thread_ex;

public class ThreadImplements implements Runnable {

	private String resource;

	public ThreadImplements(String resource) {
		this.resource = resource;

	}

	@Override
	public void run() {
		// 쓰레드에서 구현할 내용을 여기에 넣는다. 단독으로 할 행동을 넣는다고 보면된다.
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500); // 1000이 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.resource);
		}
	}

}
