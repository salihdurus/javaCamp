package day5HomeWork1;

import day5HomeWork1.business.abstracts.ValidatorService;
import day5HomeWork1.business.concretes.EmailValidatorManager;
import day5HomeWork1.business.concretes.UserManager;
import day5HomeWork1.business.concretes.UserValidator;
import day5HomeWork1.core.concretes.GoogleServiceAdapter;
import day5HomeWork1.dataAccess.concretes.ListUserDao;
import day5HomeWork1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager=new UserManager(new UserValidator(), new EmailValidatorManager(), 
				new ListUserDao(),new GoogleServiceAdapter());
		User user1=new User(1,"Salih","D�r�s","durussalih@gmail.com","123456");
		User user2=new User(2,"Engin","Demiro�","engindemirog","123456");
		User user3=new User(3,"Ali","D�r�s","alidurus@gmail.com","12345");
		User user4=new User(4,"Mahmut","D�r�s","durussalih@gmail.com","1234567");
		User user5=new User(5,"a","deneme","adeneme@gmail.com","123456");
		User user6=new User(6,"deneme","a","bdeneme@gmail.com","123456");
		User user7=new User(7,"Hakan","G�r","hakangur@gmail.com","123456");
		//Google Hesab�yla Kay�t 
		
		userManager.signUpWithGoogle("yanlismail", "123456789");
		System.out.println("***********");
		userManager.signUpWithGoogle("asd@asd.com", "123456789");
		System.out.println("***********");
		
		//Normal hesaplarla kay�t
		User[] users= {user1,user2,user3,user4,user5,user6,user7};
		for(User user:users) {
			userManager.signUp(user);
			System.out.println("********************");
		}
		
		//Simulasyon oldu�u i�in user7 yi el ile aktive ediyorum.
		ValidatorService emailValidatorManager=new EmailValidatorManager();
		emailValidatorManager.receive(user7);
		System.out.println("********");
		
		
		//Giri� i�lemi
		for(User user:users) {
			userManager.signIn(user.geteMail(), user.getPassword());
		}

	}
}
