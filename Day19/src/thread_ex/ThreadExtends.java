package thread_ex;

public class ThreadExtends extends Thread {
	// �����带 ��� ������ �ȴ� 
	
	private String resource;
	
	public ThreadExtends(String resource) {
		this.resource = resource;
		
	}
	
	
	@Override
	public void run() {
		//�����忡�� ������ ������ ���⿡ �ִ´�. �ܵ����� �� �ൿ�� �ִ´ٰ� ����ȴ�.
		for (int i= 0; i<10; i++) {
			try {
				Thread.sleep(500);   //1000�� 1��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
			System.out.println(this.resource);
		}
	}
	
	
	
	
	
	
	
}
