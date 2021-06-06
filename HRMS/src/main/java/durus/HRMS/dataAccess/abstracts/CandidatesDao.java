package durus.HRMS.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import durus.HRMS.entities.concretes.Candidates;

public interface CandidatesDao extends JpaRepository<Candidates, Integer>{
	Candidates getByIdentityNumber(String identityNumber);
	Candidates getByEmail(String email);
}
