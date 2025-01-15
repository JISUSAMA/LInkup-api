package com.bugisu.linkup.repository;

import com.bugisu.linkup.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
