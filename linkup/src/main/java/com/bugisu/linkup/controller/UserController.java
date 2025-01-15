package com.bugisu.linkup.controller;
import com.bugisu.linkup.model.User;
import com.bugisu.linkup.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/linkup")
public class UserController {
  private final UserService service;
  public  UserController(UserService service) {
    this.service = service;
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> getUserById(Long id) {
   return ResponseEntity.ok(service.getUserById(id));
  }

  @PostMapping
  public ResponseEntity<User> creeateUser(@RequestBody User user) {
    return ResponseEntity.ok(service.saveUser(user));
  }

  @PutMapping("/{id}")
  public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
    user.setId(id);
    return ResponseEntity.ok(service.saveUser(user));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
    service.deleteUser(id);
    return ResponseEntity.noContent().build();
  }
}
