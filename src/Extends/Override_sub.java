package Extends;

class Override_super{
	void x() {
		System.out.println("�θ�Ŭ���� �޼ҵ�!!");
	}
	
	public String y(String name) {
		System.out.println("�θ�Ŭ���� �޼ҵ� ==> ��ȯ�� :String - ���ڰ� : String 1��" + name);
		return "�θ�Ŭ����~~";
	}
}

public class Override_sub extends Override_super {
	void x() {
		System.out.println("�ڽ�Ŭ���� �޼ҵ�");
	}
	@Override
	public String y(String name) {
		System.out.println("�ڽ�Ŭ���� �޼ҵ� ==> ���� ���� �ٸ���..-- " + name);
		return "�ڽ�Ŭ���� - �������̵� ��!";
	}
	//�������̵��� ��ȯ���� ���� �� ��� ������ �޼ҵ带 ������ �ϴ� ���̴�. ������ ��ȯ���� ���Ŭ���� ������ �ٲپ� �������̵��� �� �ִ�.
	//�ؿ� �޼ҵ�� �������̵��� �޼ҵ尡 �ƴ�
	public Override_super y() {
		System.out.println("��ȯ���� �θ�Ŭ�������� �޼ҵ� �������̵��ϱ�");
		Override_super returnValue = new Override_super();
		return returnValue;
	}
	public static void main(String[] args) {
		Override_super ex = new Override_super();
		Override_super ex1 = new Override_sub();
		Override_sub ex2 =  new Override_sub();
		ex.x(); ex.y("whiteship");
		ex1.x(); ex1.y("whiteship1"); //ex1.y(); ==> ����
		ex2.x(); ex2.y("whiteship2");  ex2.y();
	}
}