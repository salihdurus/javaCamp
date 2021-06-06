package durus.HRMS.business.abstracts;

import java.util.List;

import durus.HRMS.core.utilities.results.Result;
import durus.HRMS.entities.concretes.Employers;

public interface EmployersService{
	List<Employers> getAll();
	Result add(Employers employers);
}
