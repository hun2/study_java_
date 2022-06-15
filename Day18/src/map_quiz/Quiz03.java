package map_quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Quiz03 {
	
	
	// final : �ѹ��� �ʱ�ȭ �ϵ��� �����ϴ� ��. ���Ŀ� �ʱ�ȭ�� ���� ���� �ʴ´�. ��� �޼ҵ�� ��밡�� ( ex , put�̶���� add����� ���)
	// 1. ������ ���̸� �ѹ� �ʱ�ȭ �� ������ ���� ���Ҵ� �Ұ� => final int a = 100;  a= 50(�Ұ�)
	// 2. �޼ҵ� �տ� ���̸� �������̵� �Ұ�. ( ��Ӱ��迡����)
	// 3. Ŭ���� �տ� ���̸� ����� �Ұ�. 
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

	     Set<String> keys = capitalMap.keySet(); // set�� �ε����� ���⶧���� list�� ������ �ؾ���.
	     List<String> keyList = new ArrayList<>(keys); // list�� �ε����� �ֱ⿡ ������.
	     
	     List<Integer> quizIndex = new ArrayList<>();
	     
	     
	     int score = 0;
	     for ( int i = 0; i < 5 ; i++) {
	    	 
	    	// ���ڴ� 20����. 0 ~19������ �ε��� ���.
		     int randIndex = rand.nextInt(20); // 0~19���� �ε��� ����� �Ǵ� rand.nextInt(keyList.size()); ����.
		     
		     //��ȣ �ߺ��˻�
		     if (quizIndex.contains(randIndex)) {
		    	i--; // �ߺ��̸� �ٽõ���. 
		    	continue;
		     }
		     
		     quizIndex.add(randIndex);
		     
		     
		     String country = keyList.get(randIndex);
		     System.out.print(country + "�� ���� �̸���? ");
		     String answer = scan.next();
		     
		     if (answer.equals(capitalMap.get(country))) {
		    	 
		    	System.out.println("����");
		    	score += 20;
		     } else {
		    	 System.out.println("����");
		     }
		     
		     
	     }
	     
	     
	     
	     
	     
	}

}
