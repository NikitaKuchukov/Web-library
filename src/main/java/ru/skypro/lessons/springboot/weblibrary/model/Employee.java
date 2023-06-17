package ru.skypro.lessons.springboot.weblibrary.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String name;
    private int salary;
}
