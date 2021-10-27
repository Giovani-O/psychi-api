package com.psychiapi.psychiapi;

import java.util.List;

import com.psychiapi.psychiapi.database.UserRepository;
import com.psychiapi.psychiapi.user.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Server path: localhost:3090
@RestController
@RequestMapping("/User")
public class UserREST {
  @Autowired
  private UserRepository lRepository;

  @GetMapping("/GetUsers")
  public List<User> GetUsers(){
    return lRepository.findAll();
  }

  @PostMapping("/SaveUser")
  public void SaveUser(@RequestBody User pUser) {
    lRepository.save(pUser);
  }

  @PutMapping("/UpdateUser")
  public void UpdateUser(@RequestBody User pUser) {
    if (pUser.getId() > 0 && pUser.getId() != null)
      lRepository.save(pUser);
  }

  @DeleteMapping("/DeleteUser")
  public void DeleteUser(@RequestBody User pUser){
    lRepository.delete(pUser);
  }
  
}
