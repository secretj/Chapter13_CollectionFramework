package ch13_3_example;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Lotto {

	static final int MAX = 45;
	static final int COUNT = 6;
	
	
	public static void main(String[] args) {
		
		/** [ �ζ� ��ȣ ������ ]
		 *  �ߺ� ���� ���� �ʴ� HashSet �̿�
		 */
		
		// ��ȣ ����? Math.random()
		// HashSet�� ����� 6���� �����Ѵ�.
		Set<Integer> set = new HashSet<Integer>(COUNT);
		
		int n=0;
		while(set.size()<COUNT) {
			n++;					//��ȸ ���Ҵ°� �ߺ��� �������ϱ�

			set.add((int) ((Math.random()*MAX)+1));
		}
		
		List<Integer> lotto = new LinkedList<>(set);
		
		Collections.sort(lotto);   // ����ũ��� �������ش�.
		
		System.out.println(lotto+","+ n+"ȸ");
		 
	}

}
