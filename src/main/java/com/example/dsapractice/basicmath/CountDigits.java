package com.example.dsapractice.basicmath;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(121));
    }

    private static int countDigits(int number){
        int digit = 0;
        while(number != 0){
            digit++;
            number/= 10;
        }
        return digit;
    }
}
