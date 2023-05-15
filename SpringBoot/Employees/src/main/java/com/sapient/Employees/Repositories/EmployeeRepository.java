package com.sapient.Employees.Repositories;

import com.sapient.Employees.Model.Department;
import com.sapient.Employees.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findEmployeeByDepartment(Department department);
}