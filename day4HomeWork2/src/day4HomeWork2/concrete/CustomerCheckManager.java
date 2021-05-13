package day4HomeWork2.concrete;

import day4HomeWork2.abstracts.CustomerCheckService;
import day4HomeWork2.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class CustomerCheckManager implements CustomerCheckService{

	
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
		
	}

	

}
