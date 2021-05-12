package GameProject1.adapter;

import GameProject1.business.abstracts.IPlayerCheckService;
import GameProject1.entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class RealPlayerCheckAdapter implements IPlayerCheckService{

	

	@Override
	public boolean checkifRealPerson(User user) 
	{
		KPSPublicSoapProxy proxy= new KPSPublicSoapProxy();
		boolean result=false;
		 
		try {
			
			result = proxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalityIdentity()),user.getFirstName().toUpperCase(),user.getLastName().toUpperCase(), user.getDateOfBirth().getYear());	
			
			
		} catch (Exception e) {
			
			
			System.out.println("Kullanýcý bilgileri hatalý!");
		}
		
		return result;
		
	}
	
	
	
	
	
}
