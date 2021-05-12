package GameProject1.business.concretes;
import GameProject1.adapter.RealPlayerCheckAdapter;
import GameProject1.business.abstracts.IUserManager;
import GameProject1.entities.concretes.User;

public class UserManager implements IUserManager {

	IUserManager userManager;
	public UserManager(IUserManager userManager) {
		this.userManager=userManager;
		
		
	}
	public UserManager(RealPlayerCheckAdapter realPlayerCheckAdapter) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void add(User user) {
	System.out.println("Kullanýcý eklendi : " + " " + user.getFirstName() + " " + user.getLastName());
	
	
	}

	@Override
	public void update(User user) {
		
		System.out.println("Kullanýcý bilgileri güncellendi:" + " " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý kaydý silindi :" );
		
	

	
		
		
	}
}
	


