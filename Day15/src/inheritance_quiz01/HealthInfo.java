package inheritance_quiz01;

public class HealthInfo {
	protected String name;
	protected int height;
	protected int weight;
	public HealthInfo(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public void showInfo() {
		// ex) ȫ�浿���� ���� 160, ������ 45kg �Դϴ�.
		System.out.println(name + "���� ���� " + height + ", ������ " + weight + "kg �Դϴ�.");
	}
	public String getName() {
		return name;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
}
