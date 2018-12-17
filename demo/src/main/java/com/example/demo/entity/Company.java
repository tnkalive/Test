package com.example.demo.entity;
import lombok.*;
import javax.persistence.*;
@Entity
@Table(name = "Company")
public class Company {
    @Id
    @GeneratedValue
    private Long id;
    private String company;

    public Company(){}

    public Long getId(){
        return id;
    }
    public void setId(Long id){
       id = id;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public String getCompany(){
        return company;
    }
}