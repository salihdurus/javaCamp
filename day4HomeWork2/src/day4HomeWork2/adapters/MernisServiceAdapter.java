package day4HomeWork2.adapters;

import java.rmi.RemoteException;


import day4HomeWork2.abstracts.CustomerCheckService;
import day4HomeWork2.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;



public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	

}}
