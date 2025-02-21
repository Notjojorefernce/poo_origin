package com.ups.poo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller2 {
    @GetMapping("/why")
    public String why(@RequestParam(required = false) String name,
                        @RequestParam(required = false) String lastname,
                        @RequestParam(required = false) Integer age) {
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

