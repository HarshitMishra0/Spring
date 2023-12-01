package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String firstLine, String city) {};
@Configuration
public class HelloWorldConfigurationClass {

    @Bean
    public String name(){
        return "Harshit";
    }

    @Bean
    public int age(){
        return 20;
    }

    @Bean
    public Person person(){
        return new Person("Ravi", 14);
    }

    @Bean
    public Address address(){
        return new Address("Block A", "Mumbai");
    }


}
