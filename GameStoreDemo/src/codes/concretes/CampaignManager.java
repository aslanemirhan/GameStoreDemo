package codes.concretes;

import codes.abstracts.CampaignService;
import codes.entities.Campaign;
import codes.entities.Game;

public class CampaignManager implements CampaignService{

	@Override
	public void campaignAdd(Game game, Campaign campaign) {
		
		System.out.println("Game called :  " + game.getGameName() + " " + campaign.getDiscount() + "TL for " + campaign.getTime() + " days!");
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
	
		System.out.println(campaign.getCampaignName() + " campaign is uptaded");
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " campaign is over");
	}

}
