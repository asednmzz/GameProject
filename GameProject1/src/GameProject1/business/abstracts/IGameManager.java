package GameProject1.business.abstracts;
import GameProject1.entities.concretes.Game;

public interface IGameManager {

	 void add(Game game);
	 void update(Game game);
	 void delete(Game game);
}
