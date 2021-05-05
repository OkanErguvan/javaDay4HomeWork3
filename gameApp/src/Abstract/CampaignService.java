package Abstract;

import Entities.Campaign;
import Entities.Game;


public interface CampaignService {
	double discount(Game game , Campaign campaign);
	
	double discountUpdate(Campaign campaign);
	
	double discountDelete(Campaign campaign);

}
