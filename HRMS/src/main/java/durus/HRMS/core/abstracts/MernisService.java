package durus.HRMS.core.abstracts;

import durus.HRMS.entities.concretes.Candidates;

public interface MernisService {
	boolean checkIfRealPerson(Candidates candidates);
}
