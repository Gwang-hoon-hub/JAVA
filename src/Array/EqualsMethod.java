package Array;

public class EqualsMethod {

	public static void main(String[] args) {
		String str1 = new String("AAA");
		String str2 = new String("AAA");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer num1 = new Integer(1);
		Integer num2 = new Integer(1);
		
		System.out.println(num1.hashCode());
		System.out.println(num2.hashCode());
	}
}
