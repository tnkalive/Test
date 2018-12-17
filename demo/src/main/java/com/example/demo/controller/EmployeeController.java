package com.example.demo.controller;
import java.util.Collection;
import java.util.stream.Collectors;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController{
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(path = "/employee")
    public Collection<Employee> employee() {
        return employeeRepository.findAll().stream().collect(Collectors.toList());
    }
    @PostMapping(path = "/Employee/{username}/password/{password}")
    public Employee employee(@PathVariable String username, @PathVariable String password){
        return this.employeeRepository.findByUsernameAndPassword(username, password);
    }
}