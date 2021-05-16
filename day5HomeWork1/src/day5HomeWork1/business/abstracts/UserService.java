package day5HomeWork1.business.abstracts;

import day5HomeWork1.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signUpWithGoogle(String email,String password);
	void signIn(String eMail,String password);
}
