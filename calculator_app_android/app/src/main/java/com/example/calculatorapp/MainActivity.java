package com.example.calculatorapp;

public class MainActivity {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("Result: " + result);
    }
}
