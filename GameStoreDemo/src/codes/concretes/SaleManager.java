package codes.concretes;

import codes.abstracts.SaleService;
import codes.entities.Game;
import codes.entities.Player;

public class SaleManager implements SaleService{

	@Override
	public void sale(Player player, Game game) {
		
		System.out.println(player.getFirstName() + " " + player.getLastname() + " bought " + game.getGameName());
		
	}

}
