package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class InsuranceType{
    @Id
    @GeneratedValue
    private Long id;
    private String insuranceType;
    public InsuranceType(){}
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setInsuranceType(String insuranceType){
        this.insuranceType = insuranceType;
    }
    public String getInsuranceType(){
        return insuranceType;
    }
    public InsuranceType(String insuranceType){
        this.insuranceType = insuranceType;      
    }
}