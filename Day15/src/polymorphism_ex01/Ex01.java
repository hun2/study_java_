package polymorphism_ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		//업캐스팅 : 자식을 부모로 캐스팅 하는것.   Animal a = new Cat();   자식이 부모에 되는 방향
		// 1. 부모 클래스의 메소드를 사용할 수 있다.
		// 2. 부모 클래스에 있는 메소드를 오버라이드 하여 ,  메소드를 사용할 수 있다.
		// 3. 자식 클래스에만 있는 메소드는 사용할 수 없다.
				
		
		Animal animal = new Dog();
		animal.eat();
		animal.cry();
		// animal.grooming(); > 3번의 특징 . 자식에만 있는 클래스는 메소드 사용불가.
		
		
		
		
		
		
		//다운캐스팅 : 부모에서 -> 자식으로 캐스팅 하는것.
		// 1. 자식 클래스가 여러개이기 때문에 명확하게 캐스팅 문법을 명시해줘야 한다.
		// 2. 어떤 자식 클래스인지 instanceof 명령어를 사용해서 검사해야한다.
		
		if(animal instanceof Cat) {
			Cat cat = (Cat) animal; // 명확하게 캐스팅 문법은 명시해야한다.
			cat.cry();
			cat.eat();
			cat.grooming();
		} else if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.cry();
			dog.eat();
			dog.lash();
		}
		
		
		
		
		
	}

}
