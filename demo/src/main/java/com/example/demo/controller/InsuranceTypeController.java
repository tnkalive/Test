package com.example.demo.controller;
import java.util.Collection;
import java.util.stream.Collectors;
import com.example.demo.entity.InsuranceType;
import com.example.demo.repository.InsuranceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class InsuranceTypeController{
    @Autowired
    private InsuranceTypeRepository insuranceTypeRepository;
    @GetMapping(path = "/InsuranceType")
    public Collection<InsuranceType> insuranceTypes() {
        return insuranceTypeRepository.findAll().stream().collect(Collectors.toList());
    }
}