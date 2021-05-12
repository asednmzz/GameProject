package GameProject1.business.abstracts;
import GameProject1.entities.concretes.User;

public interface IUserManager {

	void add(User user);
	void update(User user);
	void delete(User user);
	
	
}
