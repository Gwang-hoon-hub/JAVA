package Array;

public class ObjectArray2 {

	public static void main(String[] args) {
		ObejctArray1[] arr1 = new ObejctArray1[5]; // ��ü�迭 ����
		// �ش� ��ü �迭�� ���� ��� null ������ �ʱ�ȭ �Ǿ��ִ�.
		// ��ü �迭�� ����,���� �ϸ� �ν��Ͻ� 5���� �ٷ� �����Ǵ� ���� �ƴϴ�.
		// ������ �迭�� �������� �ν��Ͻ� �ּҸ� ����Ű�� �ּҰ��� ���� �ϴµ� ���� ������ ������ � ���� ����Ǿ� ���� �ʾ� null ���� ���´�.
		
		arr1[0] = new ObejctArray1("�̸�1", 1);
		arr1[1] = new ObejctArray1("�̸�2", 2);
		arr1[2] = new ObejctArray1("�̸�3", 3);
		
		ObejctArray1[] arr2 = new ObejctArray1[5];
		System.arraycopy(arr1, 0, arr2, 2, 3);
		
		arr2[0] = new ObejctArray1();
		arr2[1] = new ObejctArray1();
		arr2[2] = new ObejctArray1();
		
		arr1[0].setName("1����");
		arr1[0].setNumber(101);
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
			// ��µ� ���� ��ü �迭�� ����� ������ �ν��Ͻ� �ּҰ��� ���� �ִ�.
		}
	}
}
