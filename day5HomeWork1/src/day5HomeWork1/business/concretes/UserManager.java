package day5HomeWork1.business.concretes;

import day5HomeWork1.business.abstracts.UserService;
import day5HomeWork1.business.abstracts.UserValidationService;
import day5HomeWork1.business.abstracts.ValidatorService;
import day5HomeWork1.core.abstracts.UserSignUpService;
import day5HomeWork1.dataAccess.abstracts.UserDao;
import day5HomeWork1.entities.concretes.User;

public class UserManager implements UserService{

	UserValidationService userValidationService;
	ValidatorService validatorService;
	UserDao userDao;
	UserSignUpService userSignUpService;
	User user;
	

	public UserManager(UserValidationService userValidationService, ValidatorService validatorService,
			UserDao userDao,UserSignUpService userSignUpService) {
		super();
		this.userValidationService = userValidationService;
		this.validatorService = validatorService;
		this.userDao = userDao;
		this.userSignUpService=userSignUpService;
	}

	@Override
	public void signUp(User user) {
		if(userValidationService.Check(user,userDao)) {
			userDao.add(user);
			validatorService.send();
		}
		else {
			
		}
		
	}

	@Override
	public void signUpWithGoogle(String email,String password) {
		userSignUpService.checkRealAccount(email, password);
		
	}

	@Override
	public void signIn(String eMail,String password) {
		
		user=userDao.getUser(eMail, password);
		if(user==null) {
			System.out.println("Yanlýþ kullanýcý adý veya þifre !");
		}
		else {
			
			if (user.isValid()) {
				System.out.println("Baþarýyla giriþ yaptýnýz.");
			}
			else {
				System.out.println("Lütfen öncelikle E-Postanýza gidip hesabýnýzý onaylayýnýz. ");
			}
		}
		
		
	}



}
