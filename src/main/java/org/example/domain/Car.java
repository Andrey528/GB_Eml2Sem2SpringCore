package org.example.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Car {

    private String model = "X1";
    private String made = "BMW";

    // @Autowired
    private Engine carEngine;

    public Car(Engine carEngine) {
        this.carEngine = carEngine;
        System.out.println("Автомобиль создан!");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", made='" + made + '\'' +
                ", carEngin=" + carEngine +
                '}';
    }
}