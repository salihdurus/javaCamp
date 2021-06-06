package durus.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import durus.HRMS.entities.concretes.JobTitles;

public interface JobTitleDao extends JpaRepository<JobTitles, Integer>{
	JobTitles getByTitle(String title);
}
