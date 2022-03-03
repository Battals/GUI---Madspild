package com.example.guimadspildprototype.controllers;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("")
    public String start() {
        return "start";
    }

    @GetMapping("/info")
    public String info() {
        return "info";
    }

    @GetMapping("/konsekvens")
    public String konsekvens() {
        return "konsekvens";
    }

    @GetMapping("/loesning")
    public String loesning() {
        return "loesning";
    }
}
