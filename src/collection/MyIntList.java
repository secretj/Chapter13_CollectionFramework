package collection;

public class MyIntList {
	int[] arr;
	int cursor =0;
	
	
	public void remove(int idx) {
		//�����ϰ��� �ϴ� idx�� �������̸� 0���� �ʱ�ȭ.
		if(idx!=cursor-1) {
			System.arraycopy(arr, idx+1, arr, idx, (cursor-1)-idx);
		}
	}
}
		/*
		
		
		* ������ ������ �ʱ�ȭ
		arr[cursor-1] =0;
		//������ġ �缳��
		cursor--;
	*/



