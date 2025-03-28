package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double calculate(double num1, String operation, double num2) {
        return switch (operation) {
            case "add" -> num1 + num2;
            case "subtract" -> num1 - num2;
            case "multiply" -> num1 * num2;
            case "divide" -> num2 != 0 ? num1 / num2 : Double.NaN;
            default -> throw new IllegalArgumentException("Неподдерживаемая операция: " + operation);
        };
    }
}
