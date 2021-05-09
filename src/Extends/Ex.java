package Extends;
abstract class Calculator{
	int num1, num2;
	
	public void setOperands(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	int _sum() {
		return num1+num2;
	}
	
	public abstract void sum();
	public abstract void avg();
	
	public void run() {
		sum();
		avg();
	}
}
class Plus extends Calculator{

	@Override
	public void sum() {
		System.out.println("sum : " + _sum());
	}

	@Override
	public void avg() {
		System.out.println("avg : " + (this.num1 + this.num2)/2);
	}
}
class Minus extends Calculator {

	@Override
	public void sum() {
		System.out.println("sum : " + _sum());
	}

	@Override
	public void avg() {
		System.out.println("avg : " + (this.num1+this.num2)/2);
	}
}
public class Ex {
	
	public static void execute(Calculator cal) {
		System.out.println("execute메소드 ==> Calculator run()메소드 ==>  실행!!!");
		cal.run(); // Calculator 의 run()메소드 실행
	}
	public static void main(String[] args) {
		//다형성(형변환)을 사용하지 않은 코드
//		plus exPlus = new plus();
//		exPlus.setOperands(10, 10);
//		exPlus.run();
//		minus exMinus = new minus();
//		exMinus.setOperands(-10, -10);
//		exMinus.run();
		
		/*다형성, 형변환을 사용한 코드*/
		Calculator exPlus = new Plus();
		exPlus.setOperands(10, 10);
		
		Calculator exMinus = new Minus();
		exMinus.setOperands(-10, -10);
		
		execute(exPlus);
		execute(exMinus);
	}
}

