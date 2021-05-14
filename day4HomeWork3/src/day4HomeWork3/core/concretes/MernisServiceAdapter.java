package day4HomeWork3.core.concretes;

import java.rmi.RemoteException;

import day4HomeWork3.core.abstracts.CustomerCheckService;
import day4HomeWork3.entites.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkRealPerson(User user) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(user.getIdentityNumber(), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getYearOfBirth());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

}
