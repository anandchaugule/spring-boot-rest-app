package com.techonwards.data;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.techonwards.model.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	
	 @Query(value = "SELECT fname, lname FROM User", nativeQuery = true)
	 List<User> findAllNames();

}
