package codes.adapters;

import codes.abstracts.PlayerCheckService;
import codes.entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		
			KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
			
			try {
				
				return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.valueOf(player.getNationalityId()),
						player.getFirstName(), player.getLastname(), player.getDateOfBirth().getYear());
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return false;
	}

}
