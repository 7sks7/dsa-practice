package com.example.dsapractice.basicrecursion;

public class SumOfFirstNnumbers {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    private static int sum(int number){
        if(number == 0) return 0;
        return number + sum(number-1);
    }
}
