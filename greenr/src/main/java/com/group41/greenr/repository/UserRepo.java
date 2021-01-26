package com.group41.greenr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group41.greenr.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
