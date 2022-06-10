package inheritance_quiz01;


//자식
public class HealthRate extends HealthInfo {
	
	
	//생성자를 만들지 않으면 파라미터가 없는 기본 생성자가 만들어진다.
	//파라미터가 있는 생성자를 만들게 되면 기본 생성자는 만들어지지 않는다.
	//상속을 받는 자식 클래스의 객체(HealthRate) 를 생성할 때, 
	//부모생성자가 먼저 호출된 뒤 자식 생성자가 그 다음에 호출된다.
	// 밑에 경우는 부모 기본생성자가 생성되어야 하는데
	// 부모의 기본생성자가 없었기때문에 에러가 난다.
	// 3개의 파라미터값을 가진 부모 생성자를 임의로 호출된다. (에러메세지 눌러서 보면 됨).
	//단 기본 생성자를 만들어준다면, 에러메세지는 없어진다.
	
	public HealthRate(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	
	//표준 체중 구하는 메소드
	public double health() {
		double b = (height - 100) * 0.9;
		return b;
	}
	
	
	//비만도 구하는 메소드
	public String overWeight() {
		double a = ((weight - health()) / health() * 100);
		if (a < 10) {
			return "정상";
		} else if (a >= 10 && a < 20) {
			return "과체중";
		}
		
		return "비만";
	}
	
	
	
	@Override
	public void showInfo() {
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + "kg =>" + overWeight() + " 입니다.");
	}
	
	
	
	
}
