package codes.concretes;

import codes.abstracts.PlayerCheckService;
import codes.entities.Player;

public class PlayerCheckManager implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		
		if(player.getNationalityId().length() == 11) {
			return true;
		}else {
			return false;
		}
		
	}

}
