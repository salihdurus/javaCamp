package day4HomeWork3.business.abstracts;

import day4HomeWork3.entites.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
}
