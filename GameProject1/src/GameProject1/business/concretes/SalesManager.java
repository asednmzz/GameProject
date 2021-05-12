package GameProject1.business.concretes;
import GameProject1.business.abstracts.ISalesManager;
import GameProject1.entities.concretes.Campaign;
import GameProject1.entities.concretes.Sale;

public  class SalesManager implements ISalesManager{

	
 
	@Override
	public void add(Sale sale) {
		System.out.println(sale.getUser().getFirstName()+ " "+ sale.getGame().getGameName()+" "+ "adlý oyunu"+ " " + sale.getGame().getGameUnitPrice()+" " + " tl'ye satýn aldýnýz.");
		
	}
	
	public void add(Sale sale , Campaign campaign) {
		System.out.println(sale.getUser().getFirstName()+ " "+ sale.getGame().getGameName()+" "+ sale.getGame().getGameUnitPrice()+ "adlý oyunu"+ " " + campaign.getDiscount()+ " " + "indirimli satýn aldýnýz.");
		
	}
}
