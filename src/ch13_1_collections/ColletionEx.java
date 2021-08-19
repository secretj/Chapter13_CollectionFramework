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
		
		
		//���� �����ϴ� �迭
		int[] arr1 =new int[3];
		arr1[0]= 1;
		System.out.println(arr1);  //arr1�� �����ּҰ� ���
		System.out.println(arr1[0]); //arr1�� 0��°�� ����� �� ���
		System.out.println(Arrays.toString(arr1));  //�������� ����Ȱ� ���
	
		MyClass[] arr2 =new MyClass[3];  
		// ���ȣ �򰥸�������. �����ڰ� �ƴ�!
		arr2[0] = new MyClass();
		System.out.println(Arrays.toString(arr2)); 
		//ù��°�濡 �ּҰ��� ������ ������ null
		
		//�迭�� �Ѱ� ,,,, �˾Ƽ� �� ũ�Ⱑ �����ϸ� Ű������ ,,
		
		//Collection �ڷᱸ�� ����
		
		List<String> list1 =new ArrayList<>();
		//������ �θ� ������ �ڽ�Ŭ�����̰ų� 
		//������ ������ �������̽��� �����ߴ���.
		list1.add("1");
		list1.add("kor");
		System.out.println(list1);
	
	//<> ���׸��ȿ��� ����Ÿ�Ը� �� �� �ִ�. class�� string
	//��Ʈ���� ��������� ����Ŭ������ ����Ѵ�. Integer

		List<Integer> list2 =new ArrayList<>();
		list2.add(1);
		// = list2.add(1);; <<<< ���͹ڽ�
		
		List<Character> list3 = new Vector<>();
		list3.add('e'); list3.add('f');
		System.out.println(list3);
		
		List<Float> list4 =new LinkedList<>();
		list4.add(0.1f); list4.add(0.1f);
		
		List<Double> list5 =new LinkedList<>();	//�ߺ����
		list5.add(0.1);
		list5.add(0.1);
		list5.add(0.1);
		System.out.println(list5);
		
		Set<Double> set = new HashSet<>();		//�ߺ��� ������.
		set.add(0.1);
		set.add(0.1);
		set.add(0.1);
		System.out.println(set);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(211,"����");
		map.put(201,"����");
		System.out.println(map);
		
	
	
	
	
	}
}
