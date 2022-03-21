package com.example.springframeworklesson9.controllers;

import com.example.springframeworklesson9.dto.Person;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping(path = "/hola/{name}")
    public String hello(@PathVariable("name") String name){

        return "hola, "+ name +"!";
    }
    @PostMapping(path = "/goodbye")
    public String goodbye(@RequestBody Person p){
        return "Goodbye, "+ p.getName()+"!";
    }

    @GetMapping(path = "/get")
    public Person getPerson(){
        Person p = new Person();
        p.setName("akram");

        return p;
    }

    @GetMapping(path = "/getAll")
    public List<Person> getAllPersons(){
        Person p1 = new Person();
        p1.setName("akram");
        Person p2 = new Person();
        p2.setName("reda");

        return Arrays.asList(p1,p2);
    }

    @GetMapping(path = "statusControl")
    public void statusControl(HttpServletResponse response){
        response.setStatus(HttpServletResponse.SC_ACCEPTED);
    }
}
