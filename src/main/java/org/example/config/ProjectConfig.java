package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.domain")
public class ProjectConfig {


//    @Bean
//    Engine engine1()
//    {
//        Engine eng = new Engine();
//        eng.setTypeEngin("Бензиновый");
//        return eng;
//    }
//
//
//    @Bean("BMW")
//    Car car1()
//    {
//        Car obCar = new Car(engine1());
//        obCar.setModel("X1");
//        obCar.setMade("BMW");
//        return obCar;
//    }

//    @Bean(name="Audi")
//    Car car2()
//    {
//        Car obCar = new Car();
//        obCar.setModel("S8");
//        obCar.setMade("Audi");
//        return obCar;
//    }
//
//    @Bean
//    @Primary
//    Car car3()
//    {
//        Car obCar = new Car();
//        obCar.setModel("H7");
//        obCar.setMade("HAVAL");
//        return obCar;
//    }
//
//    @Bean
//    String hello() {
//        return "Hello";
//    }
//
//    @Bean
//    Integer ten() {
//        return 10;
//    }

}
