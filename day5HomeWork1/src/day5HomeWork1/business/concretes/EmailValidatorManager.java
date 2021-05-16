package day5HomeWork1.business.concretes;

import day5HomeWork1.business.abstracts.ValidatorService;
import day5HomeWork1.entities.concretes.User;

public class EmailValidatorManager implements ValidatorService{

	@Override
	public void send() {
		System.out.println( "E-Posta Adresinize Giderek Hesabýnýzý doðrulayýnýz.");
		
	}

	@Override
	public boolean receive(User user) {
		System.out.println("Email Onaylandý");
		user.setValid(true);
		return true;
	}

}
