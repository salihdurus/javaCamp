package durus.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import durus.HRMS.business.abstracts.JobTitleService;
import durus.HRMS.core.utilities.results.ErrorResult;
import durus.HRMS.core.utilities.results.Result;
import durus.HRMS.core.utilities.results.SuccessResult;
import durus.HRMS.dataAccess.abstracts.JobTitleDao;
import durus.HRMS.entities.concretes.JobTitles;

@Service
public class JobTitleManager implements JobTitleService{

	JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		this.jobTitleDao=jobTitleDao;
	}
	
	@Override
	public List<JobTitles> getAll() {
		return this.jobTitleDao.findAll();
	}

	@Override
	public Result add(JobTitles jobTitles) {
		if(this.jobTitleDao.getByTitle(jobTitles.getTitle()) !=null) {
			return new ErrorResult("Bu iş pozisyonu zaten var.");
		}
		else{
			this.jobTitleDao.save(jobTitles);
			return new SuccessResult("Eklendi");
		}
		
		
	}

}
