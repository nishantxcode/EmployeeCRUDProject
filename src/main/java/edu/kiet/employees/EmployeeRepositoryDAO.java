package edu.kiet.employees;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoryDAO extends JpaRepository<Employee, Long> {}