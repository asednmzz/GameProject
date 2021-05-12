package GameProject1.business.concretes;
import GameProject1.business.abstracts.IGameManager;
import GameProject1.entities.concretes.Game;


public class GameManager implements IGameManager{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi:" + " "+ game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		
		System.out.println("Oyun güncellendi:" + " "+ game.getGameName());
		
	}

	@Override
	public void delete(Game game) {

		System.out.println("Oyun silindi:" + " ");
		
		
		
	}

	
	
	
}
