package durus.HRMS.business.abstracts;

import java.util.List;

import durus.HRMS.core.utilities.results.Result;
import durus.HRMS.entities.concretes.Candidates;

public interface CandidatesService{

	List<Candidates> getAll();
	Result add(Candidates candidates);
}
