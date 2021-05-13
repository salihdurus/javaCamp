package day4HomeWork2;


import day4HomeWork2.abstracts.BaseCustomerManager;
import day4HomeWork2.adapters.MernisServiceAdapter;
import day4HomeWork2.concrete.NeroCustomerManager;
import day4HomeWork2.concrete.StarbucksCustomerManager;
import day4HomeWork2.entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager =new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Salih","Dürüs",1999,10000000000L));
		
	}

}
