package Concrete;


import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;

public class GameManager extends CampaignManager implements GameService {

	
	
	private Campaign campaign;

	@Override
	public double newPrice(Game game) {
		System.out.println("indirim uygulanacak oyunun ismini girin: " + game.getName());
		System.out.println("oyunun yeni fiyatý: ");
		
	
		return super.discount(game, campaign);
	}
	
	
	
	

	
		
		
}


