package com.example.dsapractice.basicrecursion;

public class PrintNto1 {
    public static void main(String[] args) {
        printNto1(10);
    }

    private static void printNto1(int number){
        if(number == 0) return;
        System.out.println(number);
        printNto1(number-1);
    }
}
