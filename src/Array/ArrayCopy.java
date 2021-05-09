package Array;

public class ArrayCopy {
	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5};
		int array1[] = {11,22,33,44,55};
		
		System.arraycopy(array, 1, array1, 3, 2);
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
	}
}
