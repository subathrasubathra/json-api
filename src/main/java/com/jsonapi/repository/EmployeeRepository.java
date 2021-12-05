package com.jsonapi.repository;
import com.jsonapi.Model.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> getAllEmployees();
    Employee saveEmployee(Employee employee);
    Optional<Employee> getEmployeeById(long id);
    void deleteEmployeeById(long id);

}
