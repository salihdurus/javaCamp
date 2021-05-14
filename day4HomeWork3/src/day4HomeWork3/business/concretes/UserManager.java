package day4HomeWork3.business.concretes;

import day4HomeWork3.business.abstracts.UserService;
import day4HomeWork3.core.abstracts.CustomerCheckService;
import day4HomeWork3.entites.concretes.User;

public class UserManager implements UserService{

	private CustomerCheckService customerCheckService;
	
	public UserManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(User user) {
		if(this.customerCheckService.checkRealPerson(user)) {
			System.out.println(user.getFirstName()+" baþarýyla kayýt oldun !");
		}
		else {
			System.out.println("Bilgilerin hatalý !!");
		}
		
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" bilgilerin güncellendi ");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" aramýzdan ayrýlman üzücü :(");
		
	}

	

}
