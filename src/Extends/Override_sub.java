package Extends;

class Override_super{
	void x() {
		System.out.println("부모클래스 메소드!!");
	}
	
	public String y(String name) {
		System.out.println("부모클래스 메소드 ==> 반환형 :String - 인자값 : String 1개" + name);
		return "부모클래스~~";
	}
}

public class Override_sub extends Override_super {
	void x() {
		System.out.println("자식클래스 메소드");
	}
	@Override
	public String y(String name) {
		System.out.println("자식클래스 메소드 ==> 나는 조금 다르지..-- " + name);
		return "자식클래스 - 오버라이딩 됨!";
	}
	//오버라이딩은 반환값과 인자 수 모두 동일한 메소드를 재정의 하는 것이다. 하지만 반환값을 상속클래스 형으로 바꾸어 오버라이딩할 수 있다.
	//밑에 메소드는 오버라이딩된 메소드가 아님
	public Override_super y() {
		System.out.println("반환형이 부모클래스형인 메소드 오버라이딩하기");
		Override_super returnValue = new Override_super();
		return returnValue;
	}
	public static void main(String[] args) {
		Override_super ex = new Override_super();
		Override_super ex1 = new Override_sub();
		Override_sub ex2 =  new Override_sub();
		ex.x(); ex.y("whiteship");
		ex1.x(); ex1.y("whiteship1"); //ex1.y(); ==> 에러
		ex2.x(); ex2.y("whiteship2");  ex2.y();
	}
}