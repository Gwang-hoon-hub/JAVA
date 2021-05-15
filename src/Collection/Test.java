package Collection;

public class Test {

	public static void main(String[] args) {
		ObjectList objectList = new ObjectList();
		objectList.add(4);
		objectList.add(1);
		int size = objectList.size();
		System.out.println(size);
		
		objectList.clear();
		size = objectList.size();
		System.out.println(size);
		
		objectList.add(1);
		int num = objectList.get(0);
		System.out.println(num);

	}

}
