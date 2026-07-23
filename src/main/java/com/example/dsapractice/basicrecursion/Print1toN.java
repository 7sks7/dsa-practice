package com.example.dsapractice.basicrecursion;

public class Print1toN {
    public static void main(String[] args) {
        print1toN(10);
    }

    private static void print1toN(int number){
        if(number == 0) return;
        print1toN(number-1);
        System.out.println(number);
    }
}
