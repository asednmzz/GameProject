package GameProject1.business.abstracts;

import GameProject1.entities.concretes.User;

public interface IPlayerCheckService {

	
	boolean checkifRealPerson(User user);
	
}
