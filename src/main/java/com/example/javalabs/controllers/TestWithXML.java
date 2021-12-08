package com.example.javalabs.controllers;

import com.example.javalabs.interfaces.IPet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithXML {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = context.getBean("Employee", Employee.class);

        employee.CallMethods();
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        context.close();
    }
}
