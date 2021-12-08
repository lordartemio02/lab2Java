package com.example.javalabs.controllers;
import com.example.javalabs.interfaces.IPet;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Dog")
public class Dog implements IPet
{
    public Dog(){
        System.out.println("Dog created!");
    }
    @Override
    public void Say(){
        System.out.println("Gaw");
    }

    @PostConstruct
    public void init(){
        System.out.println("Init dog!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy dog!");
    }
}