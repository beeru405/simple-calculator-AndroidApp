// calculator_app_android/app/src/main/java/com/example/calculatorapp/Calculator.java

package com.example.calculatorapp;

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }
}
