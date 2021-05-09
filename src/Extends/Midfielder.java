package Extends;

public class Midfielder extends Player {

	public Midfielder(String name, int number) {
		super(name, number);
		System.out.println("미드필더 생성!!");
	}
	public void through_pass() {
		System.out.println("쓰루패스!!");
		stamina -= 7;
	}
}
