package durus.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import durus.HRMS.business.abstracts.UserService;
import durus.HRMS.dataAccess.abstracts.UserDao;
import durus.HRMS.entities.concretes.Users;

@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
	}

	public List<Users> getAll(){
		return this.userDao.findAll();
	}
}
