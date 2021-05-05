package Concrete;


import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager extends CampaignCheckManager implements CampaignService {
	@Override
	public double discount(Game game, Campaign campaign) {
		return (game.getPrice() - (game.getPrice()*campaign.getAmountOfDiscount()));
	}
	
	

	
	
	
	
	@Override
	public double discountUpdate(Campaign campaign) {
		
		CampaignCheckManager campaignCheckManager = new CampaignCheckManager();
		if(campaignCheckManager.checkCampaign(campaign)) {
			campaign.setAmountOfDiscount(0.002);

			return campaign.getAmountOfDiscount();
		}else {
			return 0 ;
			
		
	}
	}



	@Override
	public double discountDelete(Campaign campaign) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	}

	



	
	


