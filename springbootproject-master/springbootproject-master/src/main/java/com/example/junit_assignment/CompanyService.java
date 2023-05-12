package com.example.junit_assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company createCompany(Company company) {
        return company;
    }

    public List<Company> getAllCompanies() {
        return null;
    }

    public Company getCompanyById(Long id) {
        return null;
    }

    public Company updateCompany(Long id, Company company) {
        return company;
    }

    public void deleteCompany(Long id) {
    }
}
