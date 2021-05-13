package day4HomeWork2.concrete;

import day4HomeWork2.abstracts.BaseCustomerManager;
import day4HomeWork2.abstracts.CustomerCheckService;
import day4HomeWork2.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(this.customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}

		
	
}
