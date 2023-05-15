package com.sapient.Employees.Controllers;

import com.sapient.Employees.EmployeesApplication;
import com.sapient.Employees.Model.Department;
import com.sapient.Employees.Model.Employee;
import com.sapient.Employees.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesControllers {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping
    public List<Employee> getAll(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping("/{id}")
    public Employee getById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    @RequestMapping("/department/{department}")
    public List<Employee> getAllByDepartment(@PathVariable Department department){
        return employeeService.getAllEmployeesByDepartment(department);
    }

    @RequestMapping(method=RequestMethod.POST)
    public Employee save(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @RequestMapping(method=RequestMethod.PUT)
    public Employee update(@RequestParam Employee employee){
        return employeeService.updateEmployeeInfo(employee);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable int id){
        employeeService.deleteEmployeeById(id);
    }
}
