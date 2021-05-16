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
		User user1=new User(1,"Salih","Dürüs","durussalih@gmail.com","123456");
		User user2=new User(2,"Engin","Demiroð","engindemirog","123456");
		User user3=new User(3,"Ali","Dürüs","alidurus@gmail.com","12345");
		User user4=new User(4,"Mahmut","Dürüs","durussalih@gmail.com","1234567");
		User user5=new User(5,"a","deneme","adeneme@gmail.com","123456");
		User user6=new User(6,"deneme","a","bdeneme@gmail.com","123456");
		User user7=new User(7,"Hakan","Gür","hakangur@gmail.com","123456");
		//Google Hesabýyla Kayýt 
		
		userManager.signUpWithGoogle("yanlismail", "123456789");
		System.out.println("***********");
		userManager.signUpWithGoogle("asd@asd.com", "123456789");
		System.out.println("***********");
		
		//Normal hesaplarla kayýt
		User[] users= {user1,user2,user3,user4,user5,user6,user7};
		for(User user:users) {
			userManager.signUp(user);
			System.out.println("********************");
		}
		
		//Simulasyon olduðu için user7 yi el ile aktive ediyorum.
		ValidatorService emailValidatorManager=new EmailValidatorManager();
		emailValidatorManager.receive(user7);
		System.out.println("********");
		
		
		//Giriþ iþlemi
		for(User user:users) {
			userManager.signIn(user.geteMail(), user.getPassword());
		}

	}
}
