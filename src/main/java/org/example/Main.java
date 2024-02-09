package org.example;

import org.example.config.ProjectConfig;
import org.example.domain.Car;
import org.example.domain.Engine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        Engine eng = context.getBean(Engine.class);

        Car simpleCar = context.getBean(Car.class);

        System.out.println(simpleCar);
        System.out.println(eng);
    }
}