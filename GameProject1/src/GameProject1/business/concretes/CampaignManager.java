package GameProject1.business.concretes;


import GameProject1.business.abstracts.ICampaignManager;
import GameProject1.entities.concretes.Campaign;


public  class CampaignManager implements ICampaignManager{


	@Override
	public void addcampaign(Campaign campaign) {
		
		System.out.println("Kampanya eklendi:" + campaign.getName());
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Kampanya güncellendi:" + campaign.getDiscount());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi:" + campaign.getName());
		
	}
 
	
	

	


	
}
