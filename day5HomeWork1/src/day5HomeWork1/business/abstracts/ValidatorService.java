package day5HomeWork1.business.abstracts;

import day5HomeWork1.entities.concretes.User;

public interface ValidatorService {
	void send();
	boolean receive(User user);
}
