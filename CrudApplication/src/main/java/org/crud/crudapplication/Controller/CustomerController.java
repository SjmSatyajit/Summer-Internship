package org.crud.crudapplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello Spring web App.";
    }

    @GetMapping("/greet/{value}")
    public String greet(@PathVariable String value){
        return "Hey "+value+ " Welcome to our App.";
    }
}
