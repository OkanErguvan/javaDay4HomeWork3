package Concrete;

import Abstract.UserCheckService;
import Entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean userCheckService(User user) {
		System.out.println("Kontrol edilecek kiþinin TC'sini girin: "+user.getNatioanlyNo());
		if(user.getNatioanlyNo() != null) {
			return true;
		}else {
			return false;
		}
		
	}
	

}
