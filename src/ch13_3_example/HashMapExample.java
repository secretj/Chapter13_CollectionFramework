package ch13_3_example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Ű(key)�� �ߺ� ���� �� �� ������ ���� �ߺ� ���� ����
 * {������=40, ��ũ��=85, ������=90, ������=95} -> Map.Entry�� ����
 *
 */


public class HashMapExample {
	public static void main(String[] args) {
		//Map �÷��� ����
		Map<String, Integer> map =new HashMap<>();
		// ��ü ����
		map.put("������", new Integer(100));
		map.put("������", 90); //����ڽ�
		map.put("��ũ��", 30);
		map.put("������", 40);
		// Ű�� �����Ƿ� ������ ���� ������ ��ü
		map.put("������",95);
		
		System.out.println("�� Entry �� : "+ map.size());
		System.out.println(map);    //{������=40, ��ũ��=85, ������=90, ������=95} Map.Entry�� ����
		
		//��ü ã�� : Ű ������ �� ��������
		System.out.println("\t������ : "+ map.get("������"));
		System.out.println();
		//Ű �˻�
		System.out.println("\t������ : " + map.containsKey("������")); //�������̶�� Ű�� �ֳľ��� boolean����
		System.out.println(map);
		
		
		//1. Set<Key> �̿�
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator(); //�ҷ����°�
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value =map.get(key);
			System.out.println("\t"+ key + ":"+ value);
		}
		keyIterator= keySet.iterator();   //�ʱ�ȭ���ִ� ���� ������.
		System.out.println();
		
		
		//��ü ����
		map.remove("��ũ��");
		System.out.println("�� entry �� :"+ map.size());
		
		//2. Set<Map.Entry> ���
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator =entrySet.iterator();
		
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry =entryIterator.next();
			String key = entry.getKey();
			Integer value =entry.getValue();
			System.out.println("\t"+ key+":"+value);
		}
		entryIterator=entrySet.iterator();
		System.out.println();
		
		
		//��ü ��ü ����
		map.clear();
		System.out.println("�� Entry �� :"+ map.size());
		}
		
		
	

}
