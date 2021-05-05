package Abstract;

import Entities.Game;
import Entities.Sale;
import Entities.User;

public interface SaleService {
	void sale(User user, Sale sale,Game game);

}
