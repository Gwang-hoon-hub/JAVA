package Extends;

public class Defense extends Player{

	public Defense(String name, int number) {
		super(name, number);
		System.out.println("����� ����!");
	}
	public void tackle(Player player) {
		System.out.println("��Ŭ ===> �� ����");
		player.stamina -= 10;
	}
	@Override
	public void shooting(Player player) {
		System.out.println("�ָ� �Ⱦ��");
		player.stamina -= 3;
	}

	@Override
	public void run(Player player) {
		System.out.println("����� ��������");
		player.stamina -= 5;
	}	
}
