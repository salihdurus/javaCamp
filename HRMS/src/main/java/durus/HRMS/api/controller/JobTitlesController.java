package durus.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import durus.HRMS.business.abstracts.JobTitleService;
import durus.HRMS.core.utilities.results.Result;
import durus.HRMS.entities.concretes.JobTitles;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitlesController {
	
	JobTitleService jobTitleService;
	
	@Autowired
	public JobTitlesController(JobTitleService jobTitleService) {
		this.jobTitleService=jobTitleService;
	}
	
	@GetMapping("/getall")
	public List<JobTitles> getAll(){
		return this.jobTitleService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobTitles jobTitles) {
		return this.jobTitleService.add(jobTitles);
	}

}
