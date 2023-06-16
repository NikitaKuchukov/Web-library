package ru.skypro.lessons.springboot.weblibrary.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.weblibrary.model.Employee;

import java.util.List;
@Repository
public interface EmployeeRepository {

    List<Employee> getAllEmployees();
}
