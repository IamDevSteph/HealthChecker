package com.alumni.HealthChecker.repositories;

import com.alumni.HealthChecker.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {


    Optional<User> findByEmail(String email);
    Optional<User> findByPhone(String phone);
}
