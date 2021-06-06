package durus.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import durus.HRMS.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer>{
	Employers getByEmail(String Email);
}
