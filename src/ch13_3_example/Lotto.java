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
		
		/** [ 로또 번호 생성기 ]
		 *  중복 저장 되지 않는 HashSet 이용
		 */
		
		// 번호 생성? Math.random()
		// HashSet의 사이즈를 6개로 설정한다.
		Set<Integer> set = new HashSet<Integer>(COUNT);
		
		int n=0;
		while(set.size()<COUNT) {
			n++;					//몇회 돌았는가 중복이 없어지니까

			set.add((int) ((Math.random()*MAX)+1));
		}
		
		List<Integer> lotto = new LinkedList<>(set);
		
		Collections.sort(lotto);   // 숫자크기로 정렬해준다.
		
		System.out.println(lotto+","+ n+"회");
		 
	}

}
