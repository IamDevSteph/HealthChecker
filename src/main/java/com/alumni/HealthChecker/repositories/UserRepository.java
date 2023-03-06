package com.alumni.HealthChecker.repositories;

import com.alumni.HealthChecker.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {



}
