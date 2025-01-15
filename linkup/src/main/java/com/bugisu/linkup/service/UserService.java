package com.bugisu.linkup.service;

import com.bugisu.linkup.model.User;
import com.bugisu.linkup.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
  private final UserRepository repository;

  public UserService(UserRepository userRepository) {
    this.repository = userRepository;
  }
  //Read
  public List<User> getAllUsers() {
    return repository.findAll();
  }
  public User getUserById(Long id) {
    return repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
  }

  //Update
  public  User saveUser(User user) {
    return repository.save(user);
  }
  //Delete
  public void deleteUser(Long id) {
    repository.deleteById(id);
  }
}

