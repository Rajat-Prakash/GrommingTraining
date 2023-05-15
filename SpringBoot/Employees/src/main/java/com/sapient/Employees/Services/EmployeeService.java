package com.sapient.Employees.Services;

import com.sapient.Employees.EmployeesApplication;
import com.sapient.Employees.Model.Department;
import com.sapient.Employees.Model.Employee;
import org.aspectj.lang.reflect.DeclareParents;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public Employee addEmployee(Employee employee);
    public Employee updateEmployeeInfo(Employee employee);
    public List<Employee> getAllEmployeesByDepartment(Department department);
    public void deleteEmployeeById(int id);
}
