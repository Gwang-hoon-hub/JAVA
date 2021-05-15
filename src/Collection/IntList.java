package Collection;

public class IntList {
	private int[] arr;
	private int current;
	public IntList() {
		arr = new int[3];
		current = 0;
	}
	
	public void add(int i) {
		arr[current++] = i;
	}

	public int size() {
		
		return current;
	}

	public void clear() {
		//arr = new int[3]; 배열변수가 새로운 배열을 가리키도록 한다.
		current = 0;
	}

	public int get(int index) {
		if(current <= index)
			throw new IndexOutOfBoundsException();
		return arr[index];
	}
}
