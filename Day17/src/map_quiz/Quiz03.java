package map_quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Quiz03 {
	
	public static final Map<String, String> capitalMap = new HashMap<String, String>() {
        {
            put("���ѹα�", "����");
            put("����ũ", "�����ϰ�");
            put("����", "������");
            put("���þ�", "��ũ��");
            put("���⿡", "���");
            put("�����", "���������");
            put("������", "����Ȧ��");
            put("������", "����");
            put("������", "���帮��");
            put("�Ƹ���Ƽ��", "�ο��뽺���̷���");
            put("����Ʈ", "ī�̷�");
            put("�̶�", "�����");
            put("��Ż����", "�θ�");
            put("�Ϻ�", "����");
            put("�ʸ���", "���Ҷ�");
            put("�ɶ���", "���Ű");
            put("������", "�ĸ�");
            put("��Ű", "��ī��");
            put("ĳ����", "��Ÿ��");
            put("�ݷҺ��", "����Ÿ");
        }
    };
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        Set<String> keys = capitalMap.keySet();
        List<String> keyList = new ArrayList<>(keys); // �����̸� List�� index�� ���� �� ��
        
        
        
        
        
        int count = 0;
        
        //ù��° ����
        System.out.print(keyList.get(rand.nextInt(20)) +"�� ���� �̸���?");
        String answer = scan.next();
        
        
        if (capitalMap.containsValue(answer)) {
        	System.out.println("����");
        	count += 25;
        } else {
        	System.out.println("Ʋ�Ƚ��ϴ�.");
        }
        
        
        
        
        
		
		
	}

}
