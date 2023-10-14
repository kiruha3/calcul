package com.kiruha.calcul.controller;


import com.kiruha.calcul.service.CalculateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculateController {
    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping()
    public String calculator() {
        return calculateService.calculator();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(required = false) Double num1, Double num2) {
        return calculateService.plus(num1, num2);

    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(required = false) Double num1, Double num2) {
        return calculateService.minus(num1, num2);
    }

    @GetMapping(path = "/div")
    public String div(@RequestParam(required = false) Double num1, Double num2) {
        return calculateService.div(num1, num2);
    }

    @GetMapping(path = "/mult")
    public String mult(@RequestParam(required = false) Double num1, Double num2) {
        return calculateService.mult(num1, num2);
    }


}
