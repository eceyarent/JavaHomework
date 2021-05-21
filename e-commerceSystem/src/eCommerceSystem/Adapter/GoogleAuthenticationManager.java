package eCommerceSystem.Adapter;

public class GoogleAuthenticationManager {
	
public boolean register(int id, String firstName, String lastName, String email, String password) {
		
		System.out.println("Please check the e-mail sent to your e-mail address in order to complete the membership process. (Google Team)");
		return true;
	}
		public boolean login(String email, String password) {
		
		System.out.println("Login with Google account is successful.");
		return true;
	}
	

}
