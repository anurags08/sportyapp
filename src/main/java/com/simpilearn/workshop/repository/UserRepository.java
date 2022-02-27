package com.simpilearn.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simpilearn.workshop.model.OrderDetails;
import com.simpilearn.workshop.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{
	User findByEmail(String email);
	
	//OrderDetails orderfindByEmail(String email);
}
