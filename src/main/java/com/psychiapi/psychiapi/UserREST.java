package com.psychiapi.psychiapi;

import java.util.List;

import com.psychiapi.psychiapi.database.UserRepository;
import com.psychiapi.psychiapi.user.User;

import org.springframework.beans.factory.annotation.Autowired;

public class UserREST {
  @Autowired
  private UserRepository repository;

  public List<User> UserList(){
    return repository.findAll();
  }
}
