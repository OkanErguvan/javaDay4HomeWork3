package Entities;

public class Campaign {
	
	String CampaignName;
	double amountOfDiscount;
	
	public Campaign() {
		
	}
	
	public Campaign(String campaignName, double  amountOfDiscount) {
		super();
		CampaignName = campaignName;
		this.amountOfDiscount = amountOfDiscount;
	}


	public String getCampaignName() {
		return CampaignName;
	}


	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}


	public double getAmountOfDiscount() {
		return amountOfDiscount;
	}


	public void setAmountOfDiscount(double amountOfDiscount) {
		this.amountOfDiscount = amountOfDiscount;
	} 
	

}
