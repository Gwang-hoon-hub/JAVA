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
		System.out.println("execute�޼ҵ� ==> Calculator run()�޼ҵ� ==>  ����!!!");
		cal.run(); // Calculator �� run()�޼ҵ� ����
	}
	public static void main(String[] args) {
		//������(����ȯ)�� ������� ���� �ڵ�
//		plus exPlus = new plus();
//		exPlus.setOperands(10, 10);
//		exPlus.run();
//		minus exMinus = new minus();
//		exMinus.setOperands(-10, -10);
//		exMinus.run();
		
		/*������, ����ȯ�� ����� �ڵ�*/
		Calculator exPlus = new Plus();
		exPlus.setOperands(10, 10);
		
		Calculator exMinus = new Minus();
		exMinus.setOperands(-10, -10);
		
		execute(exPlus);
		execute(exMinus);
	}
}

