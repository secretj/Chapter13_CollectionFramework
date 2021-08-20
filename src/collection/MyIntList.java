package collection;

public class MyIntList {
	int[] arr;
	int cursor =0;
	
	
	public void remove(int idx) {
		//삭제하고자 하는 idx가 마지막이면 0으로 초기화.
		if(idx!=cursor-1) {
			System.arraycopy(arr, idx+1, arr, idx, (cursor-1)-idx);
		}
	}
}
		/*
		
		
		* 마지막 데이터 초기화
		arr[cursor-1] =0;
		//현재위치 재설정
		cursor--;
	*/



