package inheritance_quiz01;


//�ڽ�
public class HealthRate extends HealthInfo {
	
	
	//�����ڸ� ������ ������ �Ķ���Ͱ� ���� �⺻ �����ڰ� ���������.
	//�Ķ���Ͱ� �ִ� �����ڸ� ����� �Ǹ� �⺻ �����ڴ� ��������� �ʴ´�.
	//����� �޴� �ڽ� Ŭ������ ��ü(HealthRate) �� ������ ��, 
	//�θ�����ڰ� ���� ȣ��� �� �ڽ� �����ڰ� �� ������ ȣ��ȴ�.
	// �ؿ� ���� �θ� �⺻�����ڰ� �����Ǿ�� �ϴµ�
	// �θ��� �⺻�����ڰ� �����⶧���� ������ ����.
	// 3���� �Ķ���Ͱ��� ���� �θ� �����ڸ� ���Ƿ� ȣ��ȴ�. (�����޼��� ������ ���� ��).
	//�� �⺻ �����ڸ� ������شٸ�, �����޼����� ��������.
	
	public HealthRate(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	
	//ǥ�� ü�� ���ϴ� �޼ҵ�
	public double health() {
		double b = (height - 100) * 0.9;
		return b;
	}
	
	
	//�񸸵� ���ϴ� �޼ҵ�
	public String overWeight() {
		double a = ((weight - health()) / health() * 100);
		if (a < 10) {
			return "����";
		} else if (a >= 10 && a < 20) {
			return "��ü��";
		}
		
		return "��";
	}
	
	
	
	@Override
	public void showInfo() {
		System.out.println(name + "���� ���� " + height + ", ������ " + weight + "kg =>" + overWeight() + " �Դϴ�.");
	}
	
	
	
	
}
