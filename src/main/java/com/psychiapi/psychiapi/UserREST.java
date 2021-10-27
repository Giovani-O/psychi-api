package com.psychiapi.psychiapi;

import java.util.List;

import com.psychiapi.psychiapi.database.UserRepository;
import com.psychiapi.psychiapi.user.User;

import org.springframework.beans.factory.annotation.Autowired;

public class UserREST {
  @Autowired
  private UserRepository lRepository;

  public List<User> GetUsers(){
    return lRepository.findAll();
  }

  public void SaveUser(User pUser) {
    lRepository.save(pUser);
  }

  public void UpdateUser(User pUser) {
    if (pUser.getId() > 0 && pUser.getId() != null)
      lRepository.save(pUser);
  }

  public void DeleteUser(User pUser){
    lRepository.delete(pUser);
  }
  
}
