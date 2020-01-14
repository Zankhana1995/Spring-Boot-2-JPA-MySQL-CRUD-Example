package com.demo.springboot2.SpringBoot2JPACRUDexample.repository;

import com.demo.springboot2.SpringBoot2JPACRUDexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
