package ru.skypro.lessons.springboot.weblibrary.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.weblibrary.model.Employee;
import ru.skypro.lessons.springboot.weblibrary.repository.EmployeeRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public Employee findEmployeeWithMinSalary() {
        return employeeRepository.getAllEmployees().stream()
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElse(new Employee("default", 0));
    }

    @Override
    public Employee findEmployeeWithMaxSalary() {
        return employeeRepository.getAllEmployees().stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElse(new Employee("default", 0));
    }

    @Override
    public double findSumSalariesOfEmployees() {
        return employeeRepository.getAllEmployees().stream()
                .mapToInt(Employee::getSalary)
                .sum();
    }

    @Override
    public List<Employee> findEmployeesWithAboveAverageSalaries() {
        List<Employee> employees = employeeRepository.getAllEmployees();
        double avgSalary = employees.stream()
                .mapToInt(Employee::getSalary)
                .average()
                .getAsDouble();
        return employees.stream()
                .filter(employee -> employee.getSalary() > avgSalary / getAllEmployees().size())
                .collect(Collectors.toList());
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
}
