package com.ups.poo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello world, this is my first Project!....";
    }

    @GetMapping("/concat/{name}/{lastname}/{age}")
    public String concatenate(@RequestParam String name, @RequestParam String lastname, @RequestParam Integer age) {
        String mensaje = "Este es mi primer proyecto Spring Boot!";
        if (name != null) {
            mensaje += " Mi nombre es: " + name;
        }
        if (lastname != null) {
            mensaje += " " + lastname;
        }
        if (age != 0 & age != null) {
            mensaje += " y mi edad es: " + age;
        }
        return mensaje;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name, @RequestParam String lastname, @RequestParam(required = false) Integer age) {
        String mensaje = "Este es mi primer proyecto Spring Boot!";
        if (name != null) {
            mensaje += " Mi nombre es: " + name;
        }
        if (lastname != null) {
            mensaje += " " + lastname;
        }
        if (age != null) {
            mensaje += " y mi edad es: " + age;
        }
        return mensaje;
    }
}