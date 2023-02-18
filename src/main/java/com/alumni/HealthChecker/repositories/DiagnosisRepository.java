package com.alumni.HealthChecker.repositories;

import com.alumni.HealthChecker.models.Diagnosis;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DiagnosisRepository extends CrudRepository<Diagnosis, Long> {
    Optional<Diagnosis> findDiagnosisById(Long id);
}
