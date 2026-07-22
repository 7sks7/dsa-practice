package com.example.dsapractice.basicmath;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(3));
    }

    private static boolean isPrimeNumber(int number){
        if(number <= 1) return false;
        if(number == 2) return true;
        if(number % 2 == 0) return false;

        for(int i = 3; i * i <= number; i+=2){
            if(number % i ==0){
                return false;
            }
        }
        return true;
    }
}
