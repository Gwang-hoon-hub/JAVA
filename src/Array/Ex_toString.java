package Array;

public class Ex_toString {
	int number;
	String name;
	
	public Ex_toString(int number, String name) {
		this.name = name;
		this.number = number;
	}

	public static void main(String[] args) {
		Ex_toString method = new Ex_toString(1, "�̸�");
		System.out.println(method);
		System.out.println(method.toString()); //Object Ŭ������ toString �޼ҵ� ���
		
		String str = new String("���ϴ�~"); //String Ŭ���� ��ü ����,����
		Integer num1 = new Integer(111); // Integer Ŭ���� ��ü ����,����
		System.out.println(str); 
		System.out.println(num1);
	}
}
