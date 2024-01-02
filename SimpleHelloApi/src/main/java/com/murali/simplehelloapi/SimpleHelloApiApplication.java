package com.murali.simplehelloapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/*public class SimpleHelloApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleHelloApiApplication.class, args);
    }

    @GetMapping("/")
    public String hello(){
        return "FIRST CODE IN SPRINGBOOT !!!";
    }

}*/
@SpringBootApplication
@RestController
public class SimpleHelloApiApplication{
    public static void main(String[] args){
        SpringApplication.run(SimpleHelloApiApplication.class,args);
    }

    @GetMapping("/display")
    public Details display(){


        return new Details(List.of("biriyani","barotta","fried chicken"),new Person("Murali"));
    }

    record Details(
                   List<String>fav,
                   Person person){}
    record Person(String name){}
}
