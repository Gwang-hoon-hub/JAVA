package Extends;

abstract class Abstract_super {
	abstract void x();
	// �߻�޼ҵ�� �޼ҵ��� �ñ״��� (����Ÿ��, �Ű�����, �޼����)���� �Է��� �� �ִ�. ������ ���������� �ʴ´�.
	// �߻�޼ҵ� ���� ==> abstract ����Ÿ�� �޼ҵ�� (�Ű�����);
	abstract String y(String talk);
}

public class Abstract_Ex extends Abstract_super{
	
	@Override
	void x() {
		System.out.println("�߻�޼ҵ� x() ����!!");
	}

	@Override
	String y(String talk) {
		System.out.println("�߻�޼ҵ� y() ����!!");
		return talk;
	}

	public static void main(String[] args) {
		Abstract_Ex ex = new Abstract_Ex();
		Abstract_super ex1 = new Abstract_Ex();
		//Abstract_super ex2 = new Abstract_super(); ==> �߻�Ŭ���� ��ü ���� �ȵ�!!
		ex.x(); System.out.println(ex.y("�߻�޼ҵ�!! �Ű����� ������!!"));
		ex1.x(); System.out.println(ex1.y("�߻�޼��� �Ű����� ������~~~"));
	}
}
final class Final_Method{
	public final void method() { System.out.println("���̳� �޼ҵ�");}
}
class Final_MethodTest // extends Final_Method 
{
	// public final void method() {System.out.println("�޼ҵ� �������̵�!"); }
}


