package com.sapient.Employees.Services;

import com.sapient.Employees.Model.Department;
import com.sapient.Employees.Model.Employee;
import com.sapient.Employees.Repositories.EmployeeRepository;
import com.sapient.Employees.ServicesImpl.EmployeeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class EmployeeServiceTest {
    @Mock
    EmployeeServiceImpl employeeService;
    @Mock
    EmployeeRepository employeeRepository;
    Employee employee;

    @BeforeEach
    public void createEmployee(){
        employee=new Employee(123,"Rajat","Prakash","rajat@gmail.com", Department.SOFTWARE);
        when(employeeRepository.findAll()).thenReturn(List.of(employee));
        when(employeeRepository.findById(123)).thenReturn(Optional.ofNullable(employee));
        when(employeeRepository.findEmployeeByDepartment(Department.SOFTWARE)).thenReturn(List.of(employee));
    }

    @Test
    public void getAllEmployeesTest(){
        assertEquals(employeeService.getAllEmployees(),List.of(employee));
    }

    @Test
    public void getEmployeeByIdTest(){
        assertEquals(employeeService.getEmployeeById(123),employee);
    }

    @Test
    public void getAllEmployeesByDepartmentTest(){
        assertEquals(employeeService.getAllEmployeesByDepartment(Department.SOFTWARE),List.of(employee));
    }
}
