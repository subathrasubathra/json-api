package com.jsonapi.Service;

import com.jsonapi.Model.Employee;
import com.jsonapi.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
       return employeeRepository.getAllEmployees();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.saveEmployee(employee);

    }

    public Optional<Employee> getEmployeeById(long id) {
        return employeeRepository.findById(id);
    }

    public void deleteEmployeeById(long id) {
        employeeRepository.deleteEmployeeById(id);
    }
}
