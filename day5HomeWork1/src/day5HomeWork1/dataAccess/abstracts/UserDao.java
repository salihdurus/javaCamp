package day5HomeWork1.dataAccess.abstracts;

import java.util.List;

import day5HomeWork1.entities.concretes.User;

public interface UserDao {
	void add(User user);
	List<User> getAll();
	User getUser(String email,String password);
}
