package Concrete;

import Abstract.CampaignCheckService;
import Entities.Campaign;

public class CampaignCheckManager implements CampaignCheckService {

	@Override
	public boolean checkCampaign(Campaign campaign) {
		
		System.out.println("De�i��iklik yap�lacak kampana ad� : "+campaign.getCampaignName());
		
		if(campaign.getCampaignName() != null) {
			return true;
		} else {
		
		return false;
	}
	}

	public double discountUpdate(Campaign campaign) {
		// TODO Auto-generated method stub
		return 0;
	}

}
