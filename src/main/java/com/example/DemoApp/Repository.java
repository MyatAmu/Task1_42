package com.example.DemoApp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class Repository {
    public List<Employee> Employees = Arrays.asList(
            new Employee(1, "John Doe", "Software Engineer", "IT"),
            new Employee(2, "Jane Smith", "HR Manager", "HR"),
            new Employee(3, "Michael Brown", "QA Tester", "Quality Assurance"),
            new Employee(4, "Emily Davis", "HR Specialist", "Human Resources"),
            new Employee(5, "Amritesh Bhoyer", "Intern", "Technical Team")
    );

    public List<Employee> findAll(){
        return Employees;
    }

    public Optional<Employee> findID(int ID){
        return Employees.stream().filter(e -> e.ID == ID).findFirst();
    }

}
