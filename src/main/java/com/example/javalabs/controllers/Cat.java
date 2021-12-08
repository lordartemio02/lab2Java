package com.example.javalabs.controllers;

import com.example.javalabs.interfaces.IPet;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Cat")
@Scope("prototype")
public class Cat implements IPet
{
    public Cat(){
        System.out.println("Cat created!");
    }
    @Override
    public void Say(){
        System.out.println("Meow");
    }

    @PostConstruct
    public void init(){
        System.out.println("Init cat!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy cat!");
    }
}
