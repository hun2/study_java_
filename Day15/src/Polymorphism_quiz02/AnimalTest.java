package Polymorphism_quiz02;


public class AnimalTest {

	public static void main(String[] args) {
		
		  Animal[] animals = new Animal[2];
	        animals[0] = new Cat(); // �� ĳ���� �� ����. => Animal animals = new Cat(); �β�.
	        animals[1] = new Dog();

	        
	        
	        // ��ĳ���� ���
	        for (int i = 0; i < animals.length; i++) {
	        	
	        	for (int j =0; j <3; j++) {
	        		animals[i].cry();
	        	}
	        	
			}
	        
	        
	        
	        
	        //�ٿ�ĳ����
	        for (int i = 0; i< animals.length; i++) {
	        	if (animals[i] instanceof Cat) {
	        		Cat cat = (Cat) animals[i];
	        		cat.grooming();
	        	} else if ( animals[i] instanceof Dog) {
	        		Dog dog = (Dog) animals[i];
	        		dog.lash();
	        	}
	        }
	        
		
		
	}

}
