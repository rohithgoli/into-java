package tipsTricks;

class Player {
	private String name;
	private static int playerCount;
	
	public Player(String name) {
		super();
		this.name = name;
		playerCount++;
	}

	static public int getPlayerCount() { // cannot access instance data and methods inside static methods
		return playerCount;
	}

	public String getName() {	// can access static variables too
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class StaticRunner {
	
	public static void main(String[] args) {
		Player player1 = new Player("Sachin Tendulkar");
		Player player2 = new Player("Mahendra Singh Dhoni");
		
		System.out.println(Player.getPlayerCount());
		System.out.println(Player.getPlayerCount());
	}
	
}
