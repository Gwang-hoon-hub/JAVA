package Array;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<ObejctArray1> arrList = new ArrayList<ObejctArray1>();
		
		arrList.add(new ObejctArray1("이름1", 1));
		arrList.add(new ObejctArray1("이름2", 2));
		
		for(ObejctArray1 list : arrList) {
			System.out.println(list);
			System.out.println(list.getName() + "  " + list.getNumber());
		}
	}
}
