package GameProject1.business.concretes;
import GameProject1.business.abstracts.ISalesManager;
import GameProject1.entities.concretes.Campaign;
import GameProject1.entities.concretes.Sale;

public  class SalesManager implements ISalesManager{

	
 
	@Override
	public void add(Sale sale) {
		System.out.println(sale.getUser().getFirstName()+ " "+ sale.getGame().getGameName()+" "+ "adl� oyunu"+ " " + sale.getGame().getGameUnitPrice()+" " + " tl'ye sat�n ald�n�z.");
		
	}
	
	public void add(Sale sale , Campaign campaign) {
		System.out.println(sale.getUser().getFirstName()+ " "+ sale.getGame().getGameName()+" "+ sale.getGame().getGameUnitPrice()+ "adl� oyunu"+ " " + campaign.getDiscount()+ " " + "indirimli sat�n ald�n�z.");
		
	}
}
