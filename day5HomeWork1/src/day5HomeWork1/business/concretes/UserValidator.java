package day5HomeWork1.business.concretes;



import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5HomeWork1.business.abstracts.UserValidationService;
import day5HomeWork1.dataAccess.abstracts.UserDao;
import day5HomeWork1.entities.concretes.User;

public class UserValidator implements UserValidationService{
	public UserValidator() {};
	
	public boolean Check(User user,UserDao userDao) {
		boolean control=true;
		boolean[] validations= {
				validName(user),
				validPassword(user),
				validMail(user),
				userEmailContainCheck(user,userDao),
		};
		for(boolean validation:validations) {
			if(validation==false) {
				return false;
			}
		}
		return control;
	}
	
	private boolean validPassword(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("�ifre 6 karakterden k���k olamaz !");
			return false;
		}
		else {
		return true;
		}
	}
	
	private boolean validMail(User user) {
		
		String regex="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(user.geteMail());
		if(matcher.matches()==false) {
			System.out.println("E-Posta Hatal� !");
		}
		return matcher.matches();
	}
	private boolean validName(User user) {
		if(user.getFirstName().length()<2 || user.getLastName().length()<2) {
			System.out.println("L�tfen ger�ek ad�n�z� ve soyad�n�z� girin.");
			return false;
		}
		else {
		return true;
		}
	}
	private boolean userEmailContainCheck(User user,UserDao userDao) {
		List<User> userList=userDao.getAll();
		if(userList==null) {
			return true;
		}
		else {
		for(User oneOfUser:userList) {
			if(user.geteMail()==oneOfUser.geteMail()) {
				System.out.println("Bu E-Posta �le Daha �nce Kay�t Olunmu�.");
				return false;
			}
		}
		return true;
		}
	}

}
