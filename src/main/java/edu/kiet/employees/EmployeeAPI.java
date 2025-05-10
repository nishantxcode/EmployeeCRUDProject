package edu.kiet.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeAPI {
    @Autowired
    private EmployeeRepositoryDAO employeeRepo;

    public List<Employee> getAllEmployees() { return employeeRepo.findAll(); }
    public Employee getEmployee(long id) { return employeeRepo.findById(id).orElse(null); }
    public Employee addEmployee(Employee e) { return employeeRepo.save(e); }
    public Employee updateEmployee(Employee e) { return employeeRepo.save(e); }
    public String deleteEmployee(long id) { employeeRepo.deleteById(id); return "Deleted"; }
}