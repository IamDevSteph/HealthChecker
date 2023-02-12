package com.alumni.HealthChecker.repositories;

import com.alumni.HealthChecker.models.Symptoms;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SymptomsRepository extends CrudRepository<Symptoms, Long> {
    Optional<Symptoms> findBySymptomsById(Long id);
}
