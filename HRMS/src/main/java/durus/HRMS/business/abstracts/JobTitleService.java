package durus.HRMS.business.abstracts;

import java.util.List;

import durus.HRMS.core.utilities.results.Result;
import durus.HRMS.entities.concretes.JobTitles;

public interface JobTitleService {
	List<JobTitles> getAll();
	Result add(JobTitles jobTitles);
}
