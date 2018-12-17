package com.example.demo.controller;
import java.util.Collection;
import java.util.stream.Collectors;
import com.example.demo.entity.Agent;
import com.example.demo.repository.AgentRepository;
import com.example.demo.entity.Company;
import com.example.demo.entity.Employee;
import com.example.demo.repository.CompanyRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.entity.InsuranceType;
import com.example.demo.repository.InsuranceTypeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AgentController{
    @Autowired
    private AgentRepository agentRepository;
    @Autowired 
    private InsuranceTypeRepository insuranceTypeRepository;
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(path = "/agent")
    public Collection<Agent> Agent(){
        return agentRepository.findAll().stream().collect(Collectors.toList());
    }

    @PostMapping(path = "/Agent//{company}/{fname}/{lname}/{tel}/{email}/{insuranceType}/{employee}")
    public Agent agent(@PathVariable Long company, @PathVariable String fname, @PathVariable String lname, @PathVariable String tel,@PathVariable String email,
                        @PathVariable Long insuranceType, @PathVariable Long employee){
        Agent agent = new Agent();
        agent.setFname(fname);
        agent.setLname(lname);
        agent.setTel(tel);
        agent.setEmail(email);
        Company com1 = companyRepository.findById(company).get();
        InsuranceType ins = insuranceTypeRepository.findById(insuranceType).get();
        Employee emp = employeeRepository.findById(employee).get();
        agent.setCompany(com1);
        agent.setInsuranceType(ins);
        agent.setEmployee(emp);
        agentRepository.save(agent);
        return agent;
    }
}


