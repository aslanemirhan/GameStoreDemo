package codes.concretes;

import codes.abstracts.PlayerCheckService;
import codes.abstracts.PlayerService;
import codes.entities.Player;

public class PlayerManager implements PlayerService{
	
	private PlayerCheckService playerCheckService;

	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void playerAdd(Player player) {
		
		if(playerCheckService.checkIfRealPerson(player)) {
			System.out.println(player.getFirstName() + " " + player.getLastname() + " added");
		}else {
			System.out.println("Not a valid person!");
		}
		
	}

	@Override
	public void playerUpdate(Player player) {
		if(playerCheckService.checkIfRealPerson(player)) {
			System.out.println(player.getFirstName() + " " + player.getLastname() + " updated");
		}else {
			System.out.println("Not a valid person!");
		}
		
	}

	@Override
	public void playerDelete(Player player) {
		if(playerCheckService.checkIfRealPerson(player)) {
			System.out.println(player.getFirstName() + " " + player.getLastname() + " deleted");
		}else {
			System.out.println("Not a valid person!");
		}
		
	}

}
