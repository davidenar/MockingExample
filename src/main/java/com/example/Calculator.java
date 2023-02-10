package com.example;

import java.util.List;

public class Calculator {

    public int add(List<Integer> l) {
        if (l == null) {
            throw new RuntimeException("List must not be null");
        } else {
            int sum = 0;
            for (int i : l) {
                sum = sum + i;
            }
            return sum;
        }
    }
}
