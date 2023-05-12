package com.example.junit_assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void createEmployee(Employee employee) {
    }

    public List<Employee> getAllEmployees() {
        return null;
    }

    public Employee getEmployeeById(Long id) {
        return null;
    }

    public void updateEmployee(Long id, Employee employee) {
    }

    public void deleteEmployee(Long id) {
    }

    public Employee save(Employee employee) {
        return employee;
    }
}
