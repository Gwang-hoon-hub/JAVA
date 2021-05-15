package Collection;

public class GList<T> {
	private Object[] data;
	private int current; //  현재 = 0
	private int capacity; // 초기 설정 크기
	private int amount; // 늘려가는 크기
	
	public void ExamList() {
		capacity = 3;
		amount =5;
		data = new Object[capacity];
		current =0;
	}
	
	public void add(T i) {
		if(capacity <= current) {
			Object[] temp = new Object[data.length + amount];
			System.arraycopy(data, 0, temp, 0, data.length);
//			for(int j=0; j<data.length; j++) {
//				temp[j] = data[j];
//			}
			data = temp;
			capacity += amount;
		}
		data[current++] = i;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public int get(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
