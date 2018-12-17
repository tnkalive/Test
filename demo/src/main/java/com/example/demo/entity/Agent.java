package com.example.demo.entity;

import lombok.NonNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Agent {
    @Id
    @GeneratedValue
    private Long id;
    private String fname;
    private String lname;
    private String tel;
    private String email;

    public Agent(){}
    
    @ManyToOne
    private Company company;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private InsuranceType insuranceType;

    public Agent(String fname, String lname, String tel, Company company, InsuranceType insuranceType,Employee employee){
        this.fname = fname;
        this.lname = lname;
        this.tel = tel;
        this.company = company;
        this.insuranceType = insuranceType;
        this.employee = employee;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        id = id;
    }
    public String getFname(){
        return fname;
    }
    public void setFname(String fname){
        this.fname = fname;
    }
    public String getLname(){
        return lname;
    }
    public void setLname(String lname){
        this.lname = lname;
    }
    public String getTel(){
        return tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
	public void setCompany(Company company) {
        this.company = company;
    }
    public Company getCompany(){
        return company;
    }
	public void setInsuranceType(InsuranceType insuranceType) {
        this.insuranceType = insuranceType;
    }
    public InsuranceType getInsuranceType(){
        return insuranceType;
    }
    public void setEmployee(Employee employee){
        this.employee = employee;
    }
    public Employee getEmployee(){
        return employee;
    }
}
