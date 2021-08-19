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
			System.out.println("아이디 비번");
			System.out.print("아이디 : ");
			String id = scn.nextLine().trim(); //입력한 값을 제외한 공백을 제외해줌
			System.out.print("비번 : ");
			String pass = scn.nextLine().trim(); //입력한 값을 제외한 공백을 제외해줌
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디가 존재하지않거나 비밀번호가 틀렸습니다.");
				continue;

				}else {
					if(!map.get(id).equals(pass)) {
						System.out.println("비밀번호가 틀렸습니다.");
				}else {
					System.out.println("로그인 되었습니다.");
					break;
				}
			}
		
		}
	}

}
