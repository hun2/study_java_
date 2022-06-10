package polymorphism_ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		//��ĳ���� : �ڽ��� �θ�� ĳ���� �ϴ°�.   Animal a = new Cat();   �ڽ��� �θ� �Ǵ� ����
		// 1. �θ� Ŭ������ �޼ҵ带 ����� �� �ִ�.
		// 2. �θ� Ŭ������ �ִ� �޼ҵ带 �������̵� �Ͽ� ,  �޼ҵ带 ����� �� �ִ�.
		// 3. �ڽ� Ŭ�������� �ִ� �޼ҵ�� ����� �� ����.
				
		
		Animal animal = new Dog();
		animal.eat();
		animal.cry();
		// animal.grooming(); > 3���� Ư¡ . �ڽĿ��� �ִ� Ŭ������ �޼ҵ� ���Ұ�.
		
		
		
		
		
		
		//�ٿ�ĳ���� : �θ𿡼� -> �ڽ����� ĳ���� �ϴ°�.
		// 1. �ڽ� Ŭ������ �������̱� ������ ��Ȯ�ϰ� ĳ���� ������ �������� �Ѵ�.
		// 2. � �ڽ� Ŭ�������� instanceof ��ɾ ����ؼ� �˻��ؾ��Ѵ�.
		
		if(animal instanceof Cat) {
			Cat cat = (Cat) animal; // ��Ȯ�ϰ� ĳ���� ������ ����ؾ��Ѵ�.
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
