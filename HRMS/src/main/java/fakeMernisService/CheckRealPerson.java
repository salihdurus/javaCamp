package fakeMernisService;

import durus.HRMS.entities.concretes.Candidates;

public class CheckRealPerson {

	public boolean checkIfRealPerson(Candidates candidates) {
		
		if(candidates.getIdentityNumber().length()>11 || 
				candidates.getIdentityNumber().length()<11) {
			return false;
		}
		else {
			return true;
		}
	}
}
