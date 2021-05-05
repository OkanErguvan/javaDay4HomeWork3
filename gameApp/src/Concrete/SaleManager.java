package Concrete;

import Abstract.SaleService;
import Entities.Game;
import Entities.Sale;
import Entities.User;

public class SaleManager implements SaleService {

	@Override
	public void  sale(User user, Sale sale , Game game) {
		System.out.println(game.getName()+ "sat�n al�nd�: " );
		System.out.println("yeni bakiyeniz :"+ (user.getAmountOfPrice() - game.getPrice()));
		
	}

	
	
}
