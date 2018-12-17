package com.example.demo.controller;
import java.util.Collection;
import java.util.stream.Collectors;
import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CompanyController{
    @Autowired
    private CompanyRepository companyRepository;
    @GetMapping(path = "/Company")
    public Collection<Company> Company() {
        return companyRepository.findAll().stream().collect(Collectors.toList());
    }
}