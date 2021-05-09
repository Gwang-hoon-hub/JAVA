package Array;

public class Ex_toString {
	int number;
	String name;
	
	public Ex_toString(int number, String name) {
		this.name = name;
		this.number = number;
	}

	public static void main(String[] args) {
		Ex_toString method = new Ex_toString(1, "이름");
		System.out.println(method);
		System.out.println(method.toString()); //Object 클래스의 toString 메소드 사용
		
		String str = new String("갑니다~"); //String 클래스 객체 선언,생성
		Integer num1 = new Integer(111); // Integer 클래스 객체 선언,생성
		System.out.println(str); 
		System.out.println(num1);
	}
}
