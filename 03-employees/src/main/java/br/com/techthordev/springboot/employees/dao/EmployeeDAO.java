package br.com.techthordev.springboot.employees.dao;

import br.com.techthordev.springboot.employees.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(long theId);

    Employee save(Employee theEmployee);

    void deleteById(long theId);
}
