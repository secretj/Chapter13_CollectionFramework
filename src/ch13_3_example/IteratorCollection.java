package ch13_3_example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("진형");
		list.add("섹진");
		list.add("인정");
		list.add("더키");
		list.add("진형");
		
		Iterator<String> itr = list.iterator();
		
		//반복자를 이용해서 순차적 참조
		while(itr.hasNext()) {			//hasNext(): 다음에 값이 저장되어 있는지 체크
			System.out.println(itr.next()+ "\t");;
		}
		itr = list.iterator();			//한번 더 붙여서 초기화해줘야 다음 while문이 정상적으로 출력이나옴
		
		System.out.println("==================================");
		
		while(itr.hasNext()) {			//hasNext(): 다음에 값이 저장되어 있는지 체크
			System.out.println(itr.next()+ "\t");;
		}
		itr = list.iterator();
	
	}

}
