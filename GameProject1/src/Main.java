
import java.time.LocalDate;

import GameProject1.adapter.RealPlayerCheckAdapter;
import GameProject1.business.concretes.CampaignManager;
import GameProject1.business.concretes.GameManager;
import GameProject1.business.concretes.SalesManager;
import GameProject1.business.concretes.UserManager;
import GameProject1.entities.concretes.Campaign;
import GameProject1.entities.concretes.Game;
import GameProject1.entities.concretes.Sale;
import GameProject1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		user.setFirstName("Aslýcan");
		user.setLastName("Dönmez");
		user.setNationalityIdentity("12344567891");
		user.setDateOfBirth(LocalDate.of(1996, 1, 14));
	       
      
       Game game=new Game();
       game.setId(2);
       game.setGameName("Crazy Taxi");
       game.setGameUnitPrice(55);
       
      Campaign campaign=new Campaign();
      campaign.setId(3);
      campaign.setName("Yaz Kampanyasý");
       campaign.setDiscount(25);
       
       Sale sale=new Sale();
       sale.setId(4);
       sale.setGame(game);
       sale.setUser(user);
       
       UserManager userManager=new UserManager(new RealPlayerCheckAdapter());
       userManager.add(user);
   
      GameManager gameManager=new GameManager();
      gameManager.delete(game);
       
       CampaignManager campaignManager=new CampaignManager();
       campaignManager.update(campaign);
       
       SalesManager salesManager=new SalesManager();
       salesManager.add(sale);
       
       SalesManager salesManager1=new SalesManager();
       salesManager1.add(sale,campaign);
	}

}
