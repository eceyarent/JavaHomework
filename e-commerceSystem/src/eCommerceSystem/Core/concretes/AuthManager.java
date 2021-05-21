package eCommerceSystem.Core.concretes;

import eCommerceSystem.Business.absracts.UserService;
import eCommerceSystem.Core.abstracts.AuthService;
import eCommerceSystem.Core.abstracts.UserValidationService;
import eCommerceSystem.Core.abstracts.VerificationService;
import eCommerceSystem.Entities.concretes.User;

public class AuthManager implements AuthService{
	
	UserService userService;
	UserValidationService userValidationService;
	VerificationService verificationService;
	
	public AuthManager() {
		
	}
	
	public AuthManager(UserService userService,VerificationService verificationService,UserValidationService userValidationService) {
		super();
		this.userService = userService;
		this.verificationService=verificationService;
		this.userValidationService=userValidationService;

	}
	
	
	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		
		User userToRegister = new User(id, firstName, lastName, email, password);
		if(!this.userValidationService.registerValidate(userToRegister))
		{
			System.out.println("Check your information.");
		}
		
		if(!checkIfUserExists(email))
		{
			System.out.println("Registration is available with this e-mail address. Please enter another e-mail address.");
			return;
		}
		if (!this.verificationService.verificate(userToRegister)) {
			System.out.println("Membership verification failed, registration failed.");
			return;
		}

		userService.add(userToRegister);
		
	}

	@Override
	public void login(String email, String password) {
		
		if(!this.userValidationService.loginValidate(email, password))
		{
			System.out.println("Check your login information.");
			return;
		}
		User userToLogin=userService.getByEmailAndPassword(email, password);
		
		if (userToLogin == null) {
			System.out.println("Check your e-mail or password.");
			return;
		}
		if(!checkIfUserVerified(userToLogin)) 
		{
			System.out.println("Membership verification failed, login failed.");
			return;
		}
		System.out.println("Login successful. " + userToLogin.getFirstName() + " " + userToLogin.getLastName());
		
	}

	private boolean checkIfUserExists(String email)
	{
		return userService.getByMail(email)==null;
	}
	
	private boolean checkIfUserVerified(User user)
	{
		return verificationService.verificate(user);
	}

}
