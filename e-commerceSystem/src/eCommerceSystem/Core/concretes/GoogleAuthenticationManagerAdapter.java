package eCommerceSystem.Core.concretes;

import eCommerceSystem.Core.abstracts.AuthService;

public class GoogleAuthenticationManagerAdapter implements AuthService{
	
	GoogleAuthenticationManagerAdapter googleManager=new GoogleAuthenticationManagerAdapter();

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		
		googleManager.register(id,firstName,lastName,email,password);
		System.out.println("Registered with a Google account. : " + email);
		
	}

	@Override
	public void login(String email, String password) {
		
		googleManager.login(email, password);
		System.out.println("Signed in with a Google account. : " + email);
	}

}
