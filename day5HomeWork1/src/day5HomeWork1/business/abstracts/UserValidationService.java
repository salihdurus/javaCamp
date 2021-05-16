package day5HomeWork1.business.abstracts;

import day5HomeWork1.dataAccess.abstracts.UserDao;
import day5HomeWork1.entities.concretes.User;

public interface UserValidationService {
	boolean Check(User user,UserDao userDao);
}
