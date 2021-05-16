package day5HomeWork1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5HomeWork1.dataAccess.abstracts.UserDao;
import day5HomeWork1.entities.concretes.User;

public class ListUserDao implements UserDao{
	private List<User> listUser=new ArrayList<User>();
	
	@Override
	public void add(User user) {
		System.out.println("Baþarýyla Kayýt Oldunuz");
		listUser.add(user);
	}

	@Override
	public List<User> getAll() {
		return listUser;
	}
	
	@Override
	public User getUser(String email,String password) {
		if(listUser.isEmpty()) {
			return null;
		}
		for(User user:listUser) {
			if(user.geteMail()==email && user.getPassword()==password) {
				return user;
			}
		}
		return null;
	}

}
