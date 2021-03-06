package GameProject1.entities.concretes;
public class Game extends User{

	private int id;
	private String gameName;
	private double gameUnitPrice;
	public Game() {}
	
	public Game(int id, String gameName, double gameUnitPrice) {
		this.id = id;
		this.gameName = gameName;
		this.gameUnitPrice = gameUnitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGameUnitPrice() {
		return gameUnitPrice;
	}

	public void setGameUnitPrice(double gameUnitPrice) {
		this.gameUnitPrice = gameUnitPrice;
	}
}