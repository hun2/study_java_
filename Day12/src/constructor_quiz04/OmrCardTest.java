package constructor_quiz04;

public class OmrCardTest {

	public static void main(String[] args) {
		
		Omrcard omercard = new Omrcard();
		omercard.setName("�����");
		omercard.setNumber(20200302);
		omercard.hh(3, 2, 2, 2, 1);
		
		OmrCardReader omercar = new OmrCardReader();
		omercar.test();
		
		
		
		
	
		
		System.out.println("�̸� :" + omercard.getName());
		System.out.println("�й� :" + omercard.getNumber());
		System.out.println("���� :"  );
	
	
	}	
	
}
