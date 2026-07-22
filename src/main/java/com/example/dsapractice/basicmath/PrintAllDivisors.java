package com.example.dsapractice.basicmath;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisors {
    public static void main(String[] args) {
        printDivisors(36);
    }

    private static void printDivisors(int number){
        if (number <= 0) return;
        List<Integer> divisors = new ArrayList<>();
        for(int i = 1; i * i <= number; i++){
            if(number % i == 0){
                divisors.add(i);
            }
            if(number / i != i){
                divisors.add(number/i);
            }

        }
        System.out.println(divisors);
    }
}
