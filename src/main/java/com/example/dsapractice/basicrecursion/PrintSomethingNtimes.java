package com.example.dsapractice.basicrecursion;

public class PrintSomethingNtimes {
    public static void main(String[] args) {
        printNtimes("Java", 5);
    }

    private static void printNtimes(String name, int number){
        if(number == 0) return;
        System.out.println(name);
        printNtimes(name, number-1);
    }
}
