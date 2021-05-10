package Extends;

abstract class Abstract_super {
	abstract void x();
	// 추상메소드는 메소드의 시그니쳐 (리턴타입, 매개변수, 메서드명)만을 입력할 수 있다. 내용을 구현하지는 않는다.
	// 추상메소드 정의 ==> abstract 리턴타입 메소드명 (매개변수);
	abstract String y(String talk);
}

public class Abstract_Ex extends Abstract_super{
	
	@Override
	void x() {
		System.out.println("추상메소드 x() 구현!!");
	}

	@Override
	String y(String talk) {
		System.out.println("추상메소드 y() 구현!!");
		return talk;
	}

	public static void main(String[] args) {
		Abstract_Ex ex = new Abstract_Ex();
		Abstract_super ex1 = new Abstract_Ex();
		//Abstract_super ex2 = new Abstract_super(); ==> 추상클래스 객체 생성 안됨!!
		ex.x(); System.out.println(ex.y("추상메소드!! 매개변수 보내기!!"));
		ex1.x(); System.out.println(ex1.y("추상메서드 매개변수 보내기~~~"));
	}
}
final class Final_Method{
	public final void method() { System.out.println("파이널 메소드");}
}
class Final_MethodTest // extends Final_Method 
{
	// public final void method() {System.out.println("메소드 오버라이딩!"); }
}


