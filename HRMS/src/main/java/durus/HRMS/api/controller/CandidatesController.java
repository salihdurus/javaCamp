package durus.HRMS.api.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import durus.HRMS.business.abstracts.CandidatesService;
import durus.HRMS.core.utilities.results.Result;
import durus.HRMS.entities.concretes.Candidates;

@RestController
@RequestMapping("/candidates")
public class CandidatesController {
	CandidatesService candidatesService;
	
	@Autowired
	public CandidatesController(CandidatesService candidatesService) {
		this.candidatesService=candidatesService;
	}
	
	@GetMapping("/getall")
	public List<Candidates> getAll(){
		return this.candidatesService.getAll();
	}
	
	@PostMapping("/signup")
	public Result signUp(@RequestBody Candidates candidates) {
		return this.candidatesService.add(candidates);
	}
}
