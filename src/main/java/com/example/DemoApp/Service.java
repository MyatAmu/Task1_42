package com.example.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Service {

    @Autowired
    public Repository repository;

    public List<Employee> findAllEmployees(){
        return repository.findAll();
    }

    public Optional<Employee> findByID(int ID){
        return repository.findID(ID);
    }
}
