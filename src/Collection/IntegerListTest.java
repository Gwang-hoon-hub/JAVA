package Collection;
// 정수를 관리하기 위한 컬렉션 ==> 문제는 다른 데이터 타입도 관리가 안된다.
// 모든 데이터 타입을 관리 하기 위해서 ==> Object 컬렉션 사용
public class IntegerListTest {
	public static void main(String[] args) {
		IntList list = new IntList();
		list.add(4);
		list.add(1);
		int size = list.size();
		System.out.println(size);
		
		list.clear();
		size = list.size();
		System.out.println(size);
		
		list.add(1);
		int num = list.get(0);
		System.out.println(num);
		
	}
}
