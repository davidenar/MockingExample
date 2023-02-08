package com.example;

public class Calculator {
    public int add (int num1, int num2, int... others){
        int sum = num1+num2;
        for (int i : others){
            sum = sum+i;
        }
        return sum;
    }
}
