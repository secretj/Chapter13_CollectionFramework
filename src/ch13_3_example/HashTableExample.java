package ch13_3_example;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map =new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall",  "1234");
		map.put("winter", "12345");
		
		Scanner scn = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("���̵� ���");
			System.out.print("���̵� : ");
			String id = scn.nextLine().trim(); //�Է��� ���� ������ ������ ��������
			System.out.print("��� : ");
			String pass = scn.nextLine().trim(); //�Է��� ���� ������ ������ ��������
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� ���̵� ���������ʰų� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				continue;

				}else {
					if(!map.get(id).equals(pass)) {
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}else {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}
			}
		
		}
	}

}
