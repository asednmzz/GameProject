package GameProject1.business.abstracts;
import GameProject1.entities.concretes.Campaign;

public interface ICampaignManager {
 
	 void addcampaign(Campaign campaign);
	 void update(Campaign campaign);
	 void delete(Campaign campaign);
}
