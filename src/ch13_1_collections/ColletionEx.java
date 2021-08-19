package ch13_1_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

class MyClass{}

public class ColletionEx {
	public static void main(String[] args) {
		
		
		//값을 저장하는 배열
		int[] arr1 =new int[3];
		arr1[0]= 1;
		System.out.println(arr1);  //arr1의 시작주소값 출력
		System.out.println(arr1[0]); //arr1의 0번째에 저장된 값 출력
		System.out.println(Arrays.toString(arr1));  //번지마다 저장된값 출력
	
		MyClass[] arr2 =new MyClass[3];  
		// 대괄호 헷갈리지말것. 생성자가 아님!
		arr2[0] = new MyClass();
		System.out.println(Arrays.toString(arr2)); 
		//첫번째방에 주소값이 들어오고 나머지 null
		
		//배열의 한계 ,,,, 알아서 방 크기가 부족하면 키워주지 ,,
		
		//Collection 자료구조 등장
		
		List<String> list1 =new ArrayList<>();
		//왼쪽이 부모 우측이 자식클래스이거나 
		//우측이 왼쪽의 인터페이스를 구현했던지.
		list1.add("1");
		list1.add("kor");
		System.out.println(list1);
	
	//<> 제네릭안에는 참조타입만 올 수 있다. class나 string
	//인트형을 쓰고싶으면 레포클래스을 써야한다. Integer

		List<Integer> list2 =new ArrayList<>();
		list2.add(1);
		// = list2.add(1);; <<<< 오터박싱
		
		List<Character> list3 = new Vector<>();
		list3.add('e'); list3.add('f');
		System.out.println(list3);
		
		List<Float> list4 =new LinkedList<>();
		list4.add(0.1f); list4.add(0.1f);
		
		List<Double> list5 =new LinkedList<>();	//중복허용
		list5.add(0.1);
		list5.add(0.1);
		list5.add(0.1);
		System.out.println(list5);
		
		Set<Double> set = new HashSet<>();		//중복을 허용안함.
		set.add(0.1);
		set.add(0.1);
		set.add(0.1);
		System.out.println(set);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(211,"강남");
		map.put(201,"종로");
		System.out.println(map);
		
	
	
	
	
	}
}
