package com.alumni.HealthChecker.repositories;

import com.alumni.HealthChecker.models.Diagnosis;
import org.springframework.data.repository.CrudRepository;

public interface DiagnosisRepository extends CrudRepository<Diagnosis, Long> {
    Diagnosis findDiagnosisBySymptoms(String symptoms);
}
