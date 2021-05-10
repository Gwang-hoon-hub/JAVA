package Array;

public class ObjectArray2 {

	public static void main(String[] args) {
		ObejctArray1[] arr1 = new ObejctArray1[5]; // 객체배열 생성
		// 해당 객체 배열은 현재 모두 null 값으로 초기화 되어있다.
		// 객체 배열을 선언,생성 하면 인스턴스 5개가 바로 생성되는 것이 아니다.
		// 각각의 배열의 공간에는 인스턴스 주소를 가리키는 주소값이 들어가야 하는데 아직 변수의 공간에 어떤 값도 저장되어 있지 않아 null 값을 갖는다.
		
		arr1[0] = new ObejctArray1("이름1", 1);
		arr1[1] = new ObejctArray1("이름2", 2);
		arr1[2] = new ObejctArray1("이름3", 3);
		
		ObejctArray1[] arr2 = new ObejctArray1[5];
		System.arraycopy(arr1, 0, arr2, 2, 3);
		
		arr2[0] = new ObejctArray1();
		arr2[1] = new ObejctArray1();
		arr2[2] = new ObejctArray1();
		
		arr1[0].setName("1름이");
		arr1[0].setNumber(101);
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
			// 출력된 값은 객체 배열에 저장된 공간의 인스턴스 주소값을 갖고 있다.
		}
	}
}
