package Array;

public class StdTest {

	public static void main(String[] args) {
		Student std1 = new Student(1, "홍길동");
		std1.addSubject("영어", 99);
		std1.addSubject("수학", 11);
		
		std1.show();
	}
}
