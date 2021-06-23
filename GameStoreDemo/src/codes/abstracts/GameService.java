package codes.abstracts;

import codes.entities.Game;

public interface GameService {

	void gameAdd(Game game);
	void gameUpdate(Game game);
	void gameDelete(Game game);
}
