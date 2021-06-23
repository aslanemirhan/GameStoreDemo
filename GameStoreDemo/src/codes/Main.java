package codes;

import java.time.LocalDate;

import codes.adapters.MernisServiceAdapter;
import codes.concretes.CampaignManager;
import codes.concretes.PlayerCheckManager;
import codes.concretes.PlayerManager;
import codes.concretes.SaleManager;
import codes.entities.Campaign;
import codes.entities.Game;
import codes.entities.Player;

public class Main {

	public static void main(String[] args) {
		
		// Player section
		Player player1 = new Player();
		player1.setPlayerId(1);
		player1.setFirstName("Emirhan");
		player1.setLastname("Aslan");
		player1.setDateOfBirth(LocalDate.of(1998, 8, 15));
		player1.setNationalityId("41650607090");
		
		Player player2 = new Player();
		player2.setPlayerId(2);
		player2.setFirstName("Mehmet");
		player2.setLastname("Yýlmaz");
		player2.setDateOfBirth(LocalDate.of(2021, 1, 1));
		player2.setNationalityId("12345678910");
		
		
		// Validation section
		PlayerManager playerManager1 = new PlayerManager(new MernisServiceAdapter());
		playerManager1.playerAdd(player1);
//		playerManager1.playerDelete(player1);
//		playerManager1.playerUpdate(player1);
		
		PlayerManager playerManager2 = new PlayerManager(new PlayerCheckManager());
		playerManager2.playerAdd(player2);
//		playerManager2.playerDelete(player2);
//		playerManager2.playerUpdate(player2);
		
		
		// Game section
		Game game1 = new Game(1, "The Witcher 3", 30);
		Game game2 = new Game(2, "GTA 5", 150);
		
		//Campaign section
		Campaign campaign1 = new Campaign();
		campaign1.setCampaignId(1);
		campaign1.setCampaignName("Summer");
		campaign1.setDiscount(10);
		campaign1.setTime(10);
		campaign1.setStartDate(LocalDate.of(2021, 6,29 ));
		campaign1.setFinishDate(LocalDate.of(2021, 7, 29));
		
		CampaignManager campaignManager1 = new CampaignManager();
		campaignManager1.campaignAdd(game1, campaign1);
		
		// Sale section
		SaleManager sale1 = new SaleManager();
		SaleManager sale2 = new SaleManager();
		sale1.sale(player1, game1);
		sale2.sale(player2, game2);
		
		
		
		
		
		
		

	}

}
