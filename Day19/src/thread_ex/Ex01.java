package thread_ex;

public class Ex01 {
	
	
	//���� ������
	public static void main(String[] args) throws InterruptedException {
		
		
		//������ ����� 1 : Thread Ŭ������ ��� �޾Ƽ� ����Ѵ�.
		//����: �ڹٴ� ���� ������Ƿ� �����带 ��ӹ����� �ٸ�Ŭ������ �Բ� ��� ���� �� ����.
		
		
		//�ι�° ������
		ThreadExtends te1 = new ThreadExtends("*");
		
		
		//����° ������
		ThreadExtends te2 = new ThreadExtends("@");
		
		
		//������ ���� �̱� ������ �ڵ�
//		te1.run();
//		te2.run();
		
		
//		//��Ƽ ������ ���� ���  start�� �����.
//		te1.start();
//		te2.start();
		
		
		
		//������� ����� 2. Runnable �������̽��� �����ؼ� ����Ѵ�.
		// ���߻�� ����.
		
		ThreadImplements t1 = new ThreadImplements("*");
		ThreadImplements t2 = new ThreadImplements("@");
		
		//������ ���� �̱� ������ �ڵ�
//		t1.run();
//		t2.run();
		
		
		//������ȿ� �־��ְ� ������
		Thread t11 = new Thread(t1);
		Thread t22 = new Thread(t2);
		
		
		t11.start();
		t11.join();  // t11 �̶�� �����尡 ���� ������ ���ξ����尡 ��ٷȴ�.
		t22.start();
		t22.join();
		
		
		System.out.println("���� �Ϸ�(���� �������� ��)");
		
		
	}

}
