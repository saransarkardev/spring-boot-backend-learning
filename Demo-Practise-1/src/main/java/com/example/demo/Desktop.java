package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Desktop implements Computer {

    @Override
    public void compile() {
        System.out.println("Code is compiling in a Desktop");
    }
}
