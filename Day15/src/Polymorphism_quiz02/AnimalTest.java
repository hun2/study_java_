package Polymorphism_quiz02;


public class AnimalTest {

	public static void main(String[] args) {
		
		  Animal[] animals = new Animal[2];
	        animals[0] = new Cat(); // 업 캐스팅 된 상태. => Animal animals = new Cat(); 인꼴.
	        animals[1] = new Dog();

	        
	        
	        // 업캐스팅 출력
	        for (int i = 0; i < animals.length; i++) {
	        	
	        	for (int j =0; j <3; j++) {
	        		animals[i].cry();
	        	}
	        	
			}
	        
	        
	        
	        
	        //다운캐스팅
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
