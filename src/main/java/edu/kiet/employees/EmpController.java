package edu.kiet.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class EmpController {
    @Autowired
    private EmployeeAPI employeeAPI;

    @GetMapping("/employees")
    public List<Employee> getAll() { return employeeAPI.getAllEmployees(); }

    @GetMapping("/employees/{id}")
    public Employee getOne(@PathVariable long id) { return employeeAPI.getEmployee(id); }

    @PostMapping("/employees")
    public Employee add(@RequestBody Employee e) { return employeeAPI.addEmployee(e); }

    @PutMapping("/employees")
    public Employee update(@RequestBody Employee e) { return employeeAPI.updateEmployee(e); }

    @DeleteMapping("/employees/{id}")
    public String delete(@PathVariable long id) { return employeeAPI.deleteEmployee(id); }
}