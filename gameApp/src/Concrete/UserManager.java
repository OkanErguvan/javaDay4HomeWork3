package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{

	@Override
	public void add(User user) {
		System.out.println("yeni kullanýcý eklendi :"+user.getFirsName()
		+" "+user.getLastName());
		
	}
	
	
	UserCheckManager userCheckManager=new UserCheckManager();

	@Override
	public void update(User user) {
		
		
		if(userCheckManager.userCheckService(user)==true) {
			user.setFirsName("Gökhan");
			user.setLastName("Erguvan");
			user.setNatioanlyNo("9876542");
			user.setAmountOfPrice(249.99);
			user.setBirthDay(2000, 07, 26);
			user.setId(2);
		}
		
	}

	@Override
	public void delete(User user) {
		if(userCheckManager.userCheckService(user)==true) {
			user.setAmountOfPrice(0);
			user.setBirthDay(0, 0, 0);
			user.setFirsName(null);
			user.setLastName(null);
			user.setNatioanlyNo(null);
			user.setId(0);
		}
		
		
	}

}
