package com.jsonapi.employeecontroller;

import com.jsonapi.Model.Employee;
import com.jsonapi.Service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

import com.jsonapi.exception.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // display list of employees
    @GetMapping("/employees")
    public List<Employee> viewEmployees()
    {
       List <Employee> e=new ArrayList<Employee>();
       e.add(new Employee(1,"suba@gmail.com","subathra","senthilnathan"));
        return e;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Long id)
    {
        return employeeService.getEmployeeById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

}
