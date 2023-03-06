package com.alumni.HealthChecker;

import com.alumni.HealthChecker.models.Diagnosis;
import com.alumni.HealthChecker.models.Symptoms;
import com.alumni.HealthChecker.repositories.DiagnosisRepository;
import com.alumni.HealthChecker.repositories.SymptomsRepository;
import com.alumni.HealthChecker.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class populator implements CommandLineRunner {

    @Resource
    public UserRepository userRepo;

    @Resource
    public DiagnosisRepository diagnosisRepo;

    @Resource
    public SymptomsRepository symptomsRepo;

    @Override
    public void run(String... args) throws Exception {

        Diagnosis testFlu = new Diagnosis(1L, "testFlu");
        Diagnosis testCold = new Diagnosis(2L,"testCold");
        diagnosisRepo.save(testCold);
        diagnosisRepo.save(testFlu);

    }


}
