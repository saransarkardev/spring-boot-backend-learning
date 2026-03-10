package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {

    // API --> https://localhost:8080/
    @RequestMapping("/")
    public String greet() {
        return "Hello World, Welcome to Capgemini";
    }


    // @RequestParam --> is used when the value comes from a query parameter in the URL. (/users?id=10)
    // (/welcome) --> is called endpoint and (name=Kolkata) is called Query Parameter.
    // API --> http://localhost:8080/city?name=Kolkata
    @GetMapping("/city")
    public String welcome(@RequestParam String name) {
        return "Welcome To " + name + " Habibi";
    }

    // API --> http://localhost:8080/add?a=5&b=3
    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "Sum is " + (a+b);
    }

    // @PathVariable --> is used when the value is part of the URL path. (/users/10)
    @GetMapping("/products/{id}")
    public String getProduct(@PathVariable int id) {
        return "Product ID: " + id;
    }
}
