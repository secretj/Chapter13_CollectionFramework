package com.libs.collection;

public class MyIntList{

	
		
		private int[] arr;
		private int cursor;
		
		public MyIntList(int amount) {
			this.arr = new int[amount];
			cursor=0;
		}
		
		public void add(int num) {
			try{
				arr[cursor++]=num;
			}catch(ArrayIndexOutOfBoundsException e) {
				arr =new int[cursor];
				arr[cursor]=num;
				
				
				
			}
		}
		

	public int get(int idx) {
		try {
			return arr[idx];
	}catch(ArrayIndexOutOfBoundsException e) {
		return 0;
	}
		
	}

	public int size() {
		
		return cursor;
	}
	
	@Override
	public String toString() {
		String tmp = "";
		for(int i :arr) {
			tmp +=i+",";
		}
		return "["+tmp+"]";
	
	}

	public void remove(int x) {
		String tmp ="";
		try {
		for(int i =0; i<cursor; i++) {
			if(arr[i]==arr[x]) {
				continue;
			}
			tmp+=i+",";
		
		}
		}catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println("���������ʴ� �迭�� ���� �� �����ϴ�.");
		}
		System.out.println( "["+tmp+"]");
		
		
	}

	public String clear() {
		String tm ="";
	
		for(int i=0; i<arr.length; i++) {
		arr[i]=0;
		tm+=arr[i]+",";
		if(arr[i]==arr[arr.length-1]) {
			tm+=arr[i];
		}
		
	}
		return "["+ tm +"]";
		
		
		

}
}
