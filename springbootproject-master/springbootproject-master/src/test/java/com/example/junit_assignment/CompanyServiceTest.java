package com.example.junit_assignment;

import com.example.junit_assignment.Company;
import com.example.junit_assignment.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class CompanyServiceTest  {
    @Test
    public void testGetCompany() {
            Company company = new Company();
            company.setId(1);
            company.setCompanyName("Test Company");
            company.setCompanyBranch("Test Branch");

        CrudRepository companyRepository = null;
        when(companyRepository.findById(1L)).thenReturn(Optional.of(company));

        Employee companyService = null;
        Company result = companyService.getCompany(1L);

            assertNotNull(result);
            assertEquals(1L, result.getId());
            assertEquals("Test Company", result.getCompanyName());
            assertEquals("Test Branch", result.getCompanyBranch());
        }

    }
