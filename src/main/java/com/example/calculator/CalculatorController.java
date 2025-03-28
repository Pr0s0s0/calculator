package com.example.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculate")
    public double calculate(
            @RequestParam double num1,
            @RequestParam String operation,
            @RequestParam double num2) {
        return calculatorService.calculate(num1, operation, num2);
    }
}
