package com.alumni.HealthChecker.controllers;

import com.alumni.HealthChecker.models.Diagnosis;
import com.alumni.HealthChecker.repositories.DiagnosisRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

public class DiagnosisController {

    @Resource
    private DiagnosisRepository diagnosisRepo;

    @RequestMapping({"/diagnosis"})
    public String displayDiagnosis(Model model){
        model.addAttribute("diagnosis", diagnosisRepo.findAll());
        return "diagnosisTemplate";
    }

    @RequestMapping("/diagnosis/{id}")
    public String displaySingleDiagnosis(@PathVariable Long id, Model model){
        Optional<Diagnosis> retrievedDiagnosis = diagnosisRepo.findDiagnosisById(id);
        model.addAttribute("diagnostic", retrievedDiagnosis);
        return "diagnosticTemplate";
    }
}
