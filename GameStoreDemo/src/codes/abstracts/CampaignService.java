package codes.abstracts;

import codes.entities.Campaign;
import codes.entities.Game;

public interface CampaignService {

	void campaignAdd(Game game, Campaign campaign);
	void campaignUpdate(Campaign campaign);
	void campaignDelete(Campaign campaign);
}
