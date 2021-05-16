package day5HomeWork1.core.concretes;

import GoogleService.AccountManager;
import day5HomeWork1.core.abstracts.UserSignUpService;

public class GoogleServiceAdapter implements UserSignUpService{

	@Override
	public boolean checkRealAccount(String email,String password) {
		AccountManager accountManager=new AccountManager();
		if(accountManager.SignUp(email, password)) {
			System.out.println("Google hesabýyla kayýt oldunuz.");
			return true;
		}
		else {
			System.out.println("Hatalý giriþ.");
			return false;
		}
		
	}
	
}
