package durus.HRMS.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import durus.HRMS.business.abstracts.EmployersService;
import durus.HRMS.core.utilities.results.Result;
import durus.HRMS.entities.concretes.Employers;

@RestController
@RequestMapping("api/employers")
public class EmployersController {
	
	EmployersService employersService;
	
	@Autowired
	public EmployersController(EmployersService employersService) {
		this.employersService=employersService;
	}
	
	@GetMapping("/getall")
	public List<Employers> getAll(){
		return this.employersService.getAll();
	}
	
	@PostMapping("/signUp")
	public Result signUp(@RequestBody Employers employers) {
		return this.employersService.add(employers);
	}
	
}
