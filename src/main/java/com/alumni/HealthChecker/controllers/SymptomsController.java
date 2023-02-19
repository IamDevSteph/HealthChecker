package com.alumni.HealthChecker.controllers;

import com.alumni.HealthChecker.models.Symptoms;
import com.alumni.HealthChecker.repositories.SymptomsRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

public class SymptomsController {

    @Resource
    private SymptomsRepository symptomsRepo;

    @RequestMapping({"/symptoms"})
    public String displaySymptoms(Model model){
        model.addAttribute("symptoms", symptomsRepo.findAll());
        return "symptomsTemplate";

    }
    @RequestMapping("/symptoms/{id}")
    public String displaySingleSymptom(@PathVariable Long id, Model model){
        Optional<Symptoms> retrievedSymptoms = symptomsRepo.findSymptomsById(id);
        model.addAttribute("symptom", retrievedSymptoms);
        return "symptomTemplate";
    }
}
