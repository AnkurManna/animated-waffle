package com.ankur.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankur.userservice.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

	
}
