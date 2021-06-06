package durus.HRMS.core.concretes;

import org.springframework.stereotype.Service;

import durus.HRMS.core.abstracts.MernisService;
import durus.HRMS.entities.concretes.Candidates;
import fakeMernisService.CheckRealPerson;

@Service
public class MernisServiceAdapter implements MernisService{

	@Override
	public boolean checkIfRealPerson(Candidates candidates) {
		CheckRealPerson checkRealPerson=new CheckRealPerson();
		
		return checkRealPerson.checkIfRealPerson(candidates);
		
	}

}
