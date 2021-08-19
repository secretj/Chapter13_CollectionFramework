package ch13_3_example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("��Ű");
		list.add("����");
		
		Iterator<String> itr = list.iterator();
		
		//�ݺ��ڸ� �̿��ؼ� ������ ����
		while(itr.hasNext()) {			//hasNext(): ������ ���� ����Ǿ� �ִ��� üũ
			System.out.println(itr.next()+ "\t");;
		}
		itr = list.iterator();			//�ѹ� �� �ٿ��� �ʱ�ȭ����� ���� while���� ���������� ����̳���
		
		System.out.println("==================================");
		
		while(itr.hasNext()) {			//hasNext(): ������ ���� ����Ǿ� �ִ��� üũ
			System.out.println(itr.next()+ "\t");;
		}
		itr = list.iterator();
	
	}

}
