package Extends;

public class Defense extends Player{

	public Defense(String name, int number) {
		super(name, number);
		System.out.println("수비수 생성!");
	}
	public void tackle(Player player) {
		System.out.println("태클 ===> 공 뺏기");
		player.stamina -= 10;
	}
	@Override
	public void shooting(Player player) {
		System.out.println("멀리 걷어내기");
		player.stamina -= 3;
	}

	@Override
	public void run(Player player) {
		System.out.println("수비수 스프린터");
		player.stamina -= 5;
	}	
}
