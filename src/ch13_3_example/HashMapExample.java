package ch13_3_example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 키(key)는 중복 저장 될 수 없지만 값은 중복 저장 가능
 * {강예원=40, 신크루=85, 고인정=90, 박진형=95} -> Map.Entry의 형태
 *
 */


public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map =new HashMap<>();
		// 객체 저장
		map.put("박진형", new Integer(100));
		map.put("고인정", 90); //오토박싱
		map.put("신크루", 30);
		map.put("강예원", 40);
		// 키가 같으므로 마지막 저장 값으로 대체
		map.put("박진형",95);
		
		System.out.println("총 Entry 수 : "+ map.size());
		System.out.println(map);    //{강예원=40, 신크루=85, 고인정=90, 박진형=95} Map.Entry의 형태
		
		//객체 찾기 : 키 값으로 값 가져오기
		System.out.println("\t박진형 : "+ map.get("박진형"));
		System.out.println();
		//키 검색
		System.out.println("\t고인정 : " + map.containsKey("고인정")); //고인정이라는 키가 있냐없냐 boolean형태
		System.out.println(map);
		
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value =map.get(key);
			System.out.println("\t"+ key + ":"+ value);
		}
		System.out.println();
		
		
		//객체 삭제
		map.remove("신크루");
		System.out.println("총 entry 수 :"+ map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator =entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry =entryIterator.next();
			String key = entry.getKey();
			Integer value =entry.getValue();
			System.out.println("\t"+ key+":"+value);
		}
		System.out.println();
		
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 :"+ map.size());
		}
		
		
	

}
