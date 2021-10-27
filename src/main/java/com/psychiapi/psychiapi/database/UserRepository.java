package com.psychiapi.psychiapi.database;

import com.psychiapi.psychiapi.user.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  
}
