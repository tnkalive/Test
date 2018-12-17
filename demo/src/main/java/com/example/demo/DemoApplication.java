package com.example.demo;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class DemoApplication {
	@Autowired
	private AgentRepository agentRepository;
	@Autowired
	private CompanyRepository companyRepository;
	@Autowired 
	private InsuranceTypeRepository insuranceTypeRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {SpringApplication.run(DemoApplication.class, args); }
		@Bean
  ApplicationRunner init(AgentRepository agentRepository, CompanyRepository companyRepository, InsuranceTypeRepository insuranceTypeRepository,
  							EmployeeRepository employeeRepository) {
    return args -> {
		Company company1 = new Company();
		Company company2 = new Company();
		Company company3 = new Company();
		company1.setCompany("สาขาอุดรธานี");
		company2.setCompany("สาขาโคราช");
		company3.setCompany("สาขากรุงเทพ");
		companyRepository.save(company1);
		companyRepository.save(company2);
		companyRepository.save(company3);
		InsuranceType insuranceType1 = new InsuranceType();
		InsuranceType insuranceType2 = new InsuranceType();
		insuranceType1.setInsuranceType("ประกันชีวิต");
		insuranceType2.setInsuranceType("ประกันสุขภาพ");
		insuranceTypeRepository.save(insuranceType1);
		insuranceTypeRepository.save(insuranceType2);
		Employee employee1 = new Employee("emp1","admin1");
		employeeRepository.save(employee1);
	};
}
}
