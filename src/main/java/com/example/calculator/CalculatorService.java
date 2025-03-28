package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double calculate(double num1, String operation, double num2) {
        return switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num2 != 0 ? num1 / num2 : Double.NaN;
            default -> throw new IllegalArgumentException("Not supported oper");
        };
    }
}
