package com.example.javalabs.controllers;

import com.example.javalabs.interfaces.ICar;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Car")
public class Car implements ICar {

    @Value("$BMW")
    private String model;

    public Car(){
        System.out.println("Car created!");
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }

    @PostConstruct
    public void init(){
        System.out.println("Init car!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy car!");
    }
}
