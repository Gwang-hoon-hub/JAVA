package Extends;

public class Midfielder extends Player {

	public Midfielder(String name, int number) {
		super(name, number);
		System.out.println("�̵��ʴ� ����!!");
	}
	public void through_pass() {
		System.out.println("�����н�!!");
		stamina -= 7;
	}
}
