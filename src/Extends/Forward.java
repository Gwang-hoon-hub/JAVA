package Extends;

public class Forward extends Player{
	public Forward(String name, int number) {
		super(name, number);
		System.out.println("���ݼ� ����!!");
	}

	@Override
	public void run(Player player) {
		System.out.println("���ݼ� ��������");
		player.stamina -= 10;
	}

	@Override
	public void shooting(Player player) {
		System.out.println("��~ ��~!");
		player.stamina -= 7;
	}
	
}
