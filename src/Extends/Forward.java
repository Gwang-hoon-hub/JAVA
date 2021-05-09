package Extends;

public class Forward extends Player{
	public Forward(String name, int number) {
		super(name, number);
		System.out.println("공격수 생성!!");
	}

	@Override
	public void run(Player player) {
		System.out.println("공격수 스프린터");
		player.stamina -= 10;
	}

	@Override
	public void shooting(Player player) {
		System.out.println("슛~ 골~!");
		player.stamina -= 7;
	}
	
}
