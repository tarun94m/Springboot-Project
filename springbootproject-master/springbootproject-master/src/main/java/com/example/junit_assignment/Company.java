package com.example.junit_assignment;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "company")
@Data
public class Company {
    private int id;
    private String companyName;
    private String companyBranch;
    @OneToMany(mappedBy = "company")
    private List<Employee> employees;

    public int getId() {
        return id;
    }

    public void setId(long id) {
        this.id = (int) id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyBranch() {
        return companyBranch;
    }

    public void setCompanyBranch(String companyBranch) {
        this.companyBranch = companyBranch;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
