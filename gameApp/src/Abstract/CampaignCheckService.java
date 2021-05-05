package Abstract;

import Entities.Campaign;

public interface CampaignCheckService {
	
	boolean checkCampaign(Campaign campaign);

	double discountUpdate(Campaign campaign);

}
