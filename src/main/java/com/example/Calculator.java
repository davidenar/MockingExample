package com.example;

import java.util.List;

public class Calculator {
    public int add (List<Integer> l){
        int sum = 0;
        for (int i : l){
            sum = sum+i;
        }
        return sum;
    }
}
