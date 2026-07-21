package com.example.dsapractice.basicmath;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(123));
    }

    private static int reverseNumber(int num){
        int result = 0;
        while(num != 0){
            int lastDigit = num % 10;
            result = result * 10 + lastDigit;
            num /= 10;
        }
        return result;
    }
}
