package com.example.RestAPI;

public class Calculator {
    public int sum(int a, int d){
        return a + d;
    }

    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.sum(2,2);
    }
}
