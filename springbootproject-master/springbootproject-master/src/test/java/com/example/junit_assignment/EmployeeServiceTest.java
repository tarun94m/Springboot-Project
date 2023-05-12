package com.example.junit_assignment;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.client.ExpectedCount;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.ExpectedCount.times;

public class EmployeeServiceTest {
    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    @Test
    public void testSave() {
        // Arrange
        Employee employee = new Employee();
        employee.setEmpId(1);
        employee.setEmpDept("IT");
        employee.setEmpLocation("USA");
        employee.setCompanyBranch("NYC");

        when(employeeRepository.save(employee)).thenReturn(employee);

        // Act
        Employee result = employeeService.save(employee);

        // Assert
        assertEquals(employee, result);
        verify(employeeRepository, times(1)).save(employee);
    }

    private EmployeeService verify(EmployeeRepository employeeRepository, ExpectedCount times) {
        return null;
    }
}
