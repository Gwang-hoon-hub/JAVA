package Extends;

public class Player {
	
	public int number, stamina;
	public String name;
	
	
	public Player(String name, int number) {
		this.name = name;
		this.number = number;
		stamina = 100;
	}
	
	public void run(Player player) {
		System.out.println("������Ʈ");
		player.stamina -= 10;
	}
	public void shooting(Player player) {
		System.out.println("�� ����~");
		player.stamina -= 5;
	}
}
