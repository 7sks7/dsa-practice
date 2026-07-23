package com.example.dsapractice.basicrecursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    private static int fibonacci(int number){
        if(number==0) return 0;
        if(number==1) return 1;
        return fibonacci(number-1) + fibonacci(number-2);
    }
}
