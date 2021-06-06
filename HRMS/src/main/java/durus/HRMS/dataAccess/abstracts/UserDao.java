package durus.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import durus.HRMS.entities.concretes.Users;

public interface UserDao extends JpaRepository<Users, Integer>{

}
