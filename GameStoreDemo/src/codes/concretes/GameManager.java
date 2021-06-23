package codes.concretes;

import codes.abstracts.GameService;
import codes.entities.Game;

public class GameManager implements GameService{

	@Override
	public void gameAdd(Game game) {
		
		System.out.println("Game : " + game.getGameName() + " added");
		
	}

	@Override
	public void gameUpdate(Game game) {
		
		System.out.println("Game : " + game.getGameName() + " updated");
		
	}

	@Override
	public void gameDelete(Game game) {
		
		System.out.println("Game : " + game.getGameName() + " deleted");
		
	}

}
