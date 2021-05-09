package Extends;

class Overloading_super{
	int num1=0, num2;
	String name;
	
	public void x() {
		System.out.println("super클래스 메소드 ==> 매개변수 0개");
	}
	public void x(int num) {
		this.num1 = num;
		System.out.println("super클래스 메소드 ==> int형 매개변수 1개 : " + num1);
	}
}

public class Overloading_sub extends Overloading_super{
	
	public void x(String name) {
		System.out.println("sub클래스 메소드 ==> String 매개변수 : " + name);
	}

	public static void main(String[] args) {
		Overloading_super ex = new Overloading_super();
		Overloading_super ex1 = new Overloading_sub();
		Overloading_sub ex2 = new Overloading_sub();
		
		ex.x(5); ex.x(15);
		ex1.x(); ex1.x(10);
		ex2.x("서브클래스 객체!!"); ex2.x(); ex2.x(11);
	}
}
