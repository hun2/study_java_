package map_quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Quiz05 {
	public static void main(String[] args) {
		
		Map<String, String> myCharacter = new HashMap<>();
        myCharacter.put("�г���", "���κ�Ƴ�");
        myCharacter.put("����", "������");
        myCharacter.put("����", "B");
        myCharacter.put("����", "38");

        // [{�г���=�г���1, ����=����, ����=5}, {�г���=�г���1, ����=����, ����=5}...]
        List<Map<String, String>> charaters = new ArrayList<>();
        
      
        
        Map<String, String> character1 = new HashMap<>();
        character1.put("�г���", "���ڰ����");
        character1.put("����", "����");
        character1.put("����", "A");
        character1.put("����", "11");
        charaters.add(character1);

        Map<String, String> character2 = new HashMap<>();
        character2.put("�г���", "�ϱ���");
        character2.put("����", "������");
        character2.put("����", "B");
        character2.put("����", "46");
        charaters.add(character2);

        Map<String, String> character3 = new HashMap<>();
        character3.put("�г���", "�ٴ�");
        character3.put("����", "����");
        character3.put("����", "B");
        character3.put("����", "23");
        charaters.add(character3);

        Map<String, String> character4 = new HashMap<>();
        character4.put("�г���", "�ʺ�");
        character4.put("����", "����");
        character4.put("����", "A");
        character4.put("����", "4");
        charaters.add(character4);

        Map<String, String> character5 = new HashMap<>();
        character5.put("�г���", "����G");
        character5.put("����", "����");
        character5.put("����", "B");
        character5.put("����", "84");
        charaters.add(character5);

        // TODO: ����
        
        int max = 0;
        Map<String, String> maxChar = new HashMap<>();
        
        
        Iterator<Map<String,String>> iter = charaters.iterator();
        while(iter.hasNext()) {
        	Map<String, String> character = iter.next();
        	String job = character.get("����");
        	String server = character.get("����");
        	String level = character.get("����");
        	
        	if (job.equals("����") && server.equals(myCharacter.get("����"))) {
        		System.out.println(character);
        		
        	}
        	
        	
        } 
        
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
//        for (int i =0; i < charaters.size(); i++) {
//        	Map<String,String> character = charaters.get(i);
//        	System.out.println(character);
        	     	
        	
       
		
		
		
	}
}
