package eCommerceSystem.Core.concretes;

import java.util.Random;
import java.util.Scanner;

import eCommerceSystem.Core.abstracts.VerificationService;
import eCommerceSystem.Entities.concretes.User;

public class EmailVerificationManager implements VerificationService{
	
	public boolean verificate(User user) {
		Scanner scanner = new Scanner(System.in);
		char chosenValue = 'n';
		System.out.println(user.getEmail()
				+ " A verification code has been sent to. Do you want to confirm your account? (Y / N)");
		chosenValue = scanner.next().charAt(0);

		if (chosenValue == 'y' || chosenValue == 'Y') {
			Random random = new Random();
			int randomInteger, enteredNumber, count = 0;

			do {
				randomInteger = random.nextInt(999999 - 100000 + 1) + 100000;

				System.out.println(
						 "To verify your account, enter the 6-digit password sent to your email: \\ n ->" + randomInteger);
				enteredNumber = scanner.nextInt();
				count++;
				if (count == 4) {
					System.out.println(
							"You have made too many incorrect entries, the account could not be verified. \\ n Please try again later.");
					scanner.close();
					return false;
				}
			} while (!(enteredNumber == randomInteger) && count < 4);
			System.out.println( "The account has been verified. ");
			
			scanner.close();
			return true;

		}
		scanner.close();
		return false;
		
	}
	

}
