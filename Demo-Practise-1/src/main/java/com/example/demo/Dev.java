package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    // Field Injection
    //@Autowired
//    private Laptop laptop;

    @Autowired
    @Qualifier("desktop")
    private Computer comp;

    // Constructor Injection
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }


    // Setter Injection
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {

        comp.compile();
        System.out.println("Building a Project.");
    }
}
