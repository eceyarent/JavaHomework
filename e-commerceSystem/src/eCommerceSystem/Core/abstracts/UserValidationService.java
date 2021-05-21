package eCommerceSystem.Core.abstracts;

import eCommerceSystem.Entities.concretes.User;

public interface UserValidationService {
	
	boolean registerValidate(User user);
	boolean loginValidate(String email,String password);

}
