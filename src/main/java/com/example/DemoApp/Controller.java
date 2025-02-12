package com.example.DemoApp;

import com.example.DemoApp.exception.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    public Service service;

    @GetMapping("/employees")
    public List<Employee> getAll(){
        return service.findAllEmployees();
    }

    @GetMapping("/{ID}")
    public Optional<Employee> getByID(@PathVariable int ID){
        return Optional.ofNullable(service.findByID(ID)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found with ID: " + ID)));
    }
}
