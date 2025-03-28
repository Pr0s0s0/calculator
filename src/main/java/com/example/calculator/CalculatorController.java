package com.example.calculator;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Разрешаем CORS для фронтенда
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculate")
    public Map<String, Double> calculate(
            @RequestParam double num1,
            @RequestParam String operation,
            @RequestParam double num2) {
        double result = calculatorService.calculate(num1, operation, num2);
        return Map.of("result", result);
    }
}
