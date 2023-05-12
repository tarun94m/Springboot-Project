package com.example.junit_assignment;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    private int empId;
    private String empDept;
    private String empLocation;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    public Company getCompany(long l) {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCompanyBranch(String nyc) {
    }
}
