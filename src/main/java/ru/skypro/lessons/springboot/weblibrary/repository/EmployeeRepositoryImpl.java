package ru.skypro.lessons.springboot.weblibrary.repository;

import org.springframework.stereotype.Component;
import ru.skypro.lessons.springboot.weblibrary.model.Employee;

import java.util.ArrayList;
import java.util.List;
@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final List<Employee> EMPLOYEE_LIST = List.of(
            new Employee("Gosha", 150000),
            new Employee("Lubov", 160000),
            new Employee("Lera", 170000),
            new Employee("Kirill", 180000),
            new Employee("Artem", 190000)
    );
    @Override
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(EMPLOYEE_LIST);
    }
}
