package ru.skypro.lessons.springboot.weblibrary.service;

import ru.skypro.lessons.springboot.weblibrary.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee findEmployeeWithMinSalary();
    Employee findEmployeeWithMaxSalary();
    long findSumSalariesOfEmployees();
    List<Employee> findEmployeesWithAboveAverageSalaries();

}