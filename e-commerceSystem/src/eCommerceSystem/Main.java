package eCommerceSystem;

import eCommerceSystem.Business.absracts.UserService;
import eCommerceSystem.Business.concretes.UserManager;
import eCommerceSystem.Core.abstracts.AuthService;
import eCommerceSystem.Core.concretes.AuthManager;
import eCommerceSystem.Core.concretes.EmailVerificationManager;
import eCommerceSystem.Core.concretes.UserValidationManager;
import eCommerceSystem.DataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
	
		UserService userService = new UserManager(new HibernateUserDao());
		
		AuthService authService = new AuthManager(userService, new EmailVerificationManager(), new UserValidationManager());
		authService.register(1, "Ece Yaren", "Taykutgül", "Ece@gmail.com", "123456");
		authService.login("Ece@gmail.com","123456");
	

	}

}

