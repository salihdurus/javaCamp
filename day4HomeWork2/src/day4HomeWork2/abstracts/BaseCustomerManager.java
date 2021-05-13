package day4HomeWork2.abstracts;

import day4HomeWork2.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : "+customer.getFirstName());
	}

}
