package com.example.javalabs.controllers;

import com.example.javalabs.interfaces.ICar;
import com.example.javalabs.interfaces.IPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Employee")
public class Employee {
    private IPet pet;
    private ICar car;
    @Value("${employee.name}")
    private String name;
    @Value("${employee.age}")
    private int age;

    @Autowired
    public Employee(@Qualifier("Dog") IPet pet){
        System.out.println("Employee created!");
        System.out.println("Employee set pet in constructor!");
        this.pet = pet;
    }
    @Autowired
    public void setCar(ICar car){
        System.out.println("Employee set car in constructor!");
        this.car = car;
    }
    public void setName(String name){
        System.out.println("Employee set name in setter");
        this.name = name;
    }
    public void setAge(int age){
        System.out.println("Employee set age in setter");
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){ return this.age; }

    public void CallMethods(){
        pet.Say();
    }
    @PostConstruct
    public void init(){
        System.out.println("Init Employee");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroy Employee");
    }
}
