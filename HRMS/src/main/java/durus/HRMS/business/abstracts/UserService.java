package durus.HRMS.business.abstracts;

import java.util.List;

import durus.HRMS.entities.concretes.Users;

public interface UserService {
	public List<Users> getAll();
}
